package com.easyapp.ewidgets.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity //para decirle a room que esto es parte de la db
data class PersonEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val age:Int,
    val addres:String
)
