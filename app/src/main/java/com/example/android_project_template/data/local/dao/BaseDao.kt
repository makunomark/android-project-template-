package com.example.android_project_template.data.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

internal interface BaseDao<T> {

    @Insert
    fun insert(vararg item: T)

    @Delete
    fun delete(vararg item: T)

    @Update
    fun update(vararg item: T)
}