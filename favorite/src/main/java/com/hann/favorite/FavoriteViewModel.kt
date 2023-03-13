package com.hann.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hann.core.domain.usecase.GameUseCase

class FavoriteViewModel(gameUseCase: GameUseCase) : ViewModel() {

    val favoriteGame = gameUseCase.getFavoriteGame().asLiveData()

}