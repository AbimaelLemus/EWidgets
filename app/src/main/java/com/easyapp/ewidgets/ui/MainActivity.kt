package com.easyapp.ewidgets.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.easyapp.ewidgets.R
import com.easyapp.ewidgets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val numeros = arrayOf("1", "2", "3", "4", "5")
            val aaNumeros = ArrayAdapter(this@MainActivity, R.layout.style_spinner, numeros)
            spinner1.adapter = aaNumeros

            val vocales = arrayOf("A", "E", "I", "O", "U")
            val aaVocales = ArrayAdapter(this@MainActivity, R.layout.style_spinner, vocales)
            spinner2.adapter = aaVocales

            val abc = arrayOf("A", "B", "C", "D", "E")
            val aaAbc = ArrayAdapter(this@MainActivity, R.layout.style_spinner, abc)
            spinner3.adapter = aaAbc

            btnDB.setOnClickListener {
                startActivity(Intent(this@MainActivity, A_DataBase::class.java))
            }

        }


    }
}