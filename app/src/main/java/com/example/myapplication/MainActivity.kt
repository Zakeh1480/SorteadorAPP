package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun jogar(view: View){
        var resultado: TextView = findViewById(R.id.numeroResultado)
        var numero: Int = (1..10).random()

        resultado.setText("Número sorteado: $numero")
    }

}