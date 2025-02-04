package com.fnaim.androidcomposeuiexample.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fnaim.androidcomposeuiexample.data.dao.ToDoDao
import com.fnaim.androidcomposeuiexample.data.model.ToDoTask


@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTodoDao(): ToDoDao
}