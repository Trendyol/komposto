import re
import os
import requests

# Parse changelog.md
script_dir = os.path.dirname(os.path.abspath(__file__))
file_path = os.path.join(script_dir, '..', 'CHANGELOG.md')

with open(file_path, 'r', encoding='utf-8') as changelog:
    content = changelog.read()

pattern = r"(## \[\d+\.\d+\.\d+\] - \d{4}-\d{2}-\d{2})(.*?)(?=## \[\d+\.\d+\.\d+\] - \d{4}-\d{2}-\d{2}|\Z)"

matches = re.findall(pattern, content, re.DOTALL)

parsed_sections = []
for match in matches:
    section_title = match[0].strip()
    section_content = match[1].strip()
    parsed_sections.append((section_title, section_content))

latest_release_changelog = "\n\n".join(parsed_sections[0]).replace("#", "")

modified_msg = []
for line in latest_release_changelog.split('\n'):
    if line.replace(" ", "").startswith('Added'):
        modified_msg.append(':white_check_mark: ' + '*' + line.replace(" ", "") + '*')
    elif line.replace(" ", "").startswith('Fixed'):
        modified_msg.append(':bugnet: ' + '*' + line.replace(" ", "") + '*')
    elif line.replace(" ", "").startswith('Changed'):
        modified_msg.append(':memo: ' + '*' + line.replace(" ", "") + '*')
    elif line.replace(" ", "").startswith('Removed'):
        modified_msg.append(':support-closed: ' + '*' + line.replace(" ", "") + '*')
    else:
        modified_msg.append(line)

publish_msg_description = '\n'.join(modified_msg)

# Execute Leylek task
gitlab_user_name = os.getenv('GITLAB_USER_NAME')
image_tag = os.getenv('CI_COMMIT_REF_NAME')
publish_msg = f'UI Kit new version deployed. :checkmark:\nDeployer: {gitlab_user_name}\n{publish_msg_description}'

url = 'https://mobile-androidplatform-leylek-legacy-service.mars.trendyol.com/slack/send-message'
headers = {
    "Content-Type": "application/json",
    "Authorization": "442c5be1-5fa8-4880-b304-619eebb61d65"
}
data = {
    "channel": "temp-leylek-commands-workflow",
    "message": publish_msg
}
requests.post(url=url, headers=headers, json=data)
