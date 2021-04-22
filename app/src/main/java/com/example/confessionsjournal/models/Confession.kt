package com.example.confessionsjournal.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bumptech.glide.Glide.init
import java.io.Serializable
import kotlin.properties.Delegates

@Entity(tableName = "ConfessionsTable")
class Confession(confessionTxt: String, dateAndTime: Long) : Serializable{

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private var uid: Int = 0

    private var confessionTxt: String = confessionTxt
    private var dateAndTime : Long = dateAndTime

}