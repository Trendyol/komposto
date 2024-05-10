package com.trendyol.design.core.inputfield.email

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle

/**
 * Utility object providing email format suggestions based on input text.
 *
 * This object analyzes the input text and suggests email format suggestions based on predefined domain list.
 */
internal object SuggestEmailProviderUtil {

    private val DOMAIN_LIST = listOf(
        "@gmail.com",
        "@hotmail.com",
        "@hotmail.com.tr",
        "@hotmail.de",
        "@windowslive.com",
        "@outlook.com",
        "@yahoo.com",
        "@yahoo.com.tr",
        "@mynet.com",
        "@icloud.com",
        "@msn.com",
        "@mail.ru",
        "@yandex.com",
        "@trendyol.com",
    )

    fun suggest(email: String): AnnotatedString {
        return if (email.contains("@")) {
            val domainText = email.substring(email.indexOf("@"))
            val hit = DOMAIN_LIST.firstOrNull { it.startsWith(domainText) }
            if (hit != null) {
                buildAnnotatedString {
                    append(email)
                    withStyle(style = SpanStyle(color = Color.LightGray)) {
                        append(hit.substring(domainText.length))
                    }
                }
            } else {
                buildAnnotatedString { append(email) }
            }
        } else {
            buildAnnotatedString { append(email) }
        }
    }
}
