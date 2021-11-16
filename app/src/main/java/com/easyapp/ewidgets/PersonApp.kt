package com.easyapp.ewidgets

import android.app.Application
import androidx.room.Room
import com.easyapp.ewidgets.db.PeopleDb

class RoomApp:Application() {

    lateinit var roomApp : PeopleDb
    private set

    override fun onCreate() {
        super.onCreate()

        roomApp = Room.databaseBuilder(this, PeopleDb::class.java, "person").build()

    }

}