package com.example.unscramble

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameEntity(
    @PrimaryKey val id: Int,
    val word: String
)
