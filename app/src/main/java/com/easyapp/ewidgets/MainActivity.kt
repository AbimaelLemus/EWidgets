package com.easyapp.ewidgets

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numeros = arrayOf("1\n---", "2\n---", "3\n---", "4\n---", "5\n---")
        val aaNumeros = ArrayAdapter(this, R.layout.style_spinner, numeros)
        findViewById<Spinner>(R.id.spinner1).adapter = aaNumeros

        val vocales = arrayOf("A", "E", "I", "O", "U")
        val aaVocales = ArrayAdapter(this, R.layout.style_spinner, vocales)
        findViewById<Spinner>(R.id.spinner2).adapter = aaVocales

        val abc = arrayOf("A", "B", "C", "D", "E")
        val aaAbc = ArrayAdapter(this, R.layout.style_spinner, abc)
        findViewById<Spinner>(R.id.spinner3).adapter = aaAbc


    }
}