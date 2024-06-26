import re
import os

print("Script Beginning")

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

latest_release_changelog = "\n\n".join(parsed_sections[0])
os.environ['PUBLISH_MSG_DESCRIPTION'] = latest_release_changelog

pub_msg = os.getenv('PUBLISH_MSG_DESCRIPTION')