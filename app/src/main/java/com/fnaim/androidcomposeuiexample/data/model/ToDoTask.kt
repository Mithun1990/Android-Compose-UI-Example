package com.fnaim.androidcomposeuiexample.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fnaim.androidcomposeuiexample.util.Constants

@Entity(tableName = Constants.TABLE_NAME)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)