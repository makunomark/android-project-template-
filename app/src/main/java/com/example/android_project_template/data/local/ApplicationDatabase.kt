package com.example.android_project_template.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.android_project_template.data.local.dao.ScoreDao
import com.example.android_project_template.data.local.entities.Score
import com.example.android_project_template.data.local.util.Converters

@Database(entities = [Score::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
internal abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun getScoreDao(): ScoreDao
}
