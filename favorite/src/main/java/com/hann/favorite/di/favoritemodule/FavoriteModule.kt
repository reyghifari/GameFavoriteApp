package com.hann.favorite.di.favoritemodule

import com.hann.favorite.FavoriteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteviewModelModule = module {
    viewModel {
        FavoriteViewModel(get())
    }
}