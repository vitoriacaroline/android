package com.example.ac1_vitoria_ferreira

import androidx.annotation.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verSituacao(componente:View) {
        Toast.makeText(this, "AAA", Toast.LENGTH_SHORT).show()
    }
}