package com.hann.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val gameId: String,
    val name: String,
    val released: String,
    val rating: Double,
    val background_image: String,
    val playtime: String,
    val isFavorite: Boolean
) : Parcelable