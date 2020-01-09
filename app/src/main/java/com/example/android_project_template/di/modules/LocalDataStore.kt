package com.example.android_project_template.di.modules

import android.app.Application
import androidx.room.Room
import com.example.android_project_template.data.local.ApplicationDatabase
import com.example.android_project_template.data.local.dao.ScoreDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class LocalDataStore {

    @Singleton
    @Provides
    fun provideDatabase(context: Application): ApplicationDatabase {
        return Room.databaseBuilder(
            context,
            ApplicationDatabase::class.java,
            "application_database"
        ).build()
    }

    @Singleton
    @Provides
    fun provideScoreDao(database: ApplicationDatabase): ScoreDao {
        return database.getScoreDao()
    }
}