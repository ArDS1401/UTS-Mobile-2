package com.example.unscramble.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.unscramble.GameDatabase

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            val application = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
                ?: throw IllegalStateException()

            val database = GameDatabase.getDatabase(application)

            GameViewModel(gameDao = database.gameDao())
        }
    }
}