package com.kreativmynds.core.presentation.ui

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed interface UIText {
    data class DynamicString(val value: String) : UIText
    data class StringResource(
        @StringRes val id: Int,
        val args: Array<Any> = arrayOf()
    ) : UIText

    @Composable
    fun asString(context: Context): String {
        return when (this) {
            is DynamicString -> value
            is StringResource -> context.getString(id, *args)
        }
    }
}