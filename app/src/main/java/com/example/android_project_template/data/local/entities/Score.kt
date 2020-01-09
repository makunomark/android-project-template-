package com.example.android_project_template.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
internal data class Score(
    @PrimaryKey(autoGenerate = true) var id: Long,
    var dateCreated: Date,
    var score: Int
)