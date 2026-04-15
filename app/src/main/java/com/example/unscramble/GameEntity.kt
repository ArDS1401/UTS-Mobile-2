package com.example.unscramble

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_game")
data class GameEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val word: String
)
