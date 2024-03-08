package com.trendyol.design.core.statelayout

import android.os.Parcelable
import androidx.compose.runtime.Stable
import com.trendyol.design.core.statelayout.states.LoadingType
import kotlinx.parcelize.Parcelize

@Stable
@Parcelize
sealed class State : Parcelable {
    data class Content(val type: LoadingType?) : State()
    data class WarningInfo(val model: InfoModel) : State()
    data class Loading(val message: String? = null) : State()

    /**
     * When we need the LoadingWithContent state, we must set the LoadingType.Progressive in Content.
     * Loading type should be set to null only where Content is needed.
     * Since our empty and error state designs are the same, WarningInfo State covers both. We will separate the differences in these states with the incoming info model.
     *
     */
}
