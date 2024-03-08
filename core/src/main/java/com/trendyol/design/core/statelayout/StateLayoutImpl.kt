package com.trendyol.design.core.statelayout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import kotlin.properties.Delegates

class LayoutStateImpl(
    initialState: State = State.WarningInfo(model = provideInitialStateInfoModel()),
) : LayoutState {
    private var _content by mutableStateOf(initialState)

    // Derived State
    private var hasUpdatedValue by Delegates.vetoable(_content) { _, oldValue, newValue ->
        if (oldValue != newValue) {
            _content = newValue
        }
        oldValue != newValue
    }

    override var content: State
        get() = _content
        set(value) {
            hasUpdatedValue = value
        }

    companion object {
        val Saver = listSaver(
            save = { listOf(it.content) },
            restore = {
                LayoutStateImpl(initialState = it[0] as State)
            }
        )
    }
}

@Composable
fun rememberContentState(
    initialState: State = State.WarningInfo(model = provideInitialStateInfoModel()),
): LayoutState =
    rememberSaveable(key = initialState.toString(), saver = LayoutStateImpl.Saver) {
        LayoutStateImpl(initialState)
    }

private fun provideInitialStateInfoModel() : InfoModel {
    return InfoModel(
        layoutStyle = LayoutStyle.SMALL,
        title = null,
        description = null,
        image = null,
        buttonsInfoModel = ButtonsInfoModel(
            showPrimaryButton = false,
            showSecondaryButton = false,
            primaryButtonText = null,
            secondaryButtonText = null
        )
    )
}
