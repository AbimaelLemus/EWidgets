package com.easyapp.ewidgets.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.easyapp.ewidgets.RoomApp
import com.easyapp.ewidgets.databinding.ActivityAdataBaseBinding
import kotlinx.coroutines.launch

class A_DataBase : AppCompatActivity() {

    private lateinit var binding: ActivityAdataBaseBinding
    val TAG = "A_DataBase"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdataBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //hay que hacer las peticiones fuera del hilo principal
        //room con corutinas de kotlin
        lifecycleScope.launch {

            val app = application as RoomApp
            val peopleDb = app.roomApp.personDao().getAll()
            Log.e(TAG, "onCreate: ${peopleDb.size} person")
        }

    }
}