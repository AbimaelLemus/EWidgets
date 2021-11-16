package com.easyapp.ewidgets.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(//creacion de la base de datos
    entities = [PersonEntity::class],
    version = 2 //version de la base de datos
)
abstract class PeopleDb : RoomDatabase(){
    abstract fun personDao(): PersonDao
}