package com.trendyol.design.core.statelayout

import android.os.Parcelable
import androidx.compose.runtime.Stable
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Stable
@Parcelize
sealed class State : Parcelable {
    data class ContentWithLoading(val loadingType: LoadingType?) : State()
    data class WarningInfo(val warningInfoStateLayoutStyle: @RawValue WarningInfoStateLayoutStyle) : State()
    data class Loading(val message: String? = null) : State()

    /**
     * When we need the LoadingWithContent state, we must set the LoadingType.Progressive in ContentWithLoading.
     * Loading type should be set to null only where Content is needed.
     * Since our empty and error state designs are the same, WarningInfo State covers both. We will separate the differences in these states with the incoming info model.
     *
     */
}
