package com.example.primeiroapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var showButton: Button
    private lateinit var hideButton: Button

    private val phrases = arrayOf("Sejam feliz hoje com o que voces possuem, não esperem a felicidade no fim mas sim no caminho!", "A vida é uma aventura, ousa vivê-la.!", "A vida é como uma câmera, foque no que é importante, capture bons momentos, desenvolva a vida a partir de negativos. E, se as coisas não derem certo, tire outra foto.", "A vida é uma jornada, não um destino.", "A vida não é sobre esperar a tempestade passar, é sobre aprender a dançar na chuva.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textview)
        showButton = findViewById(R.id.show_button)
        hideButton = findViewById(R.id.hide_button)

        showButton.setOnClickListener {
            val randomIndex = (0 until phrases.size).random()
            textView.text = phrases[randomIndex]
            textView.visibility = View.VISIBLE
        }

        hideButton.setOnClickListener {
            textView.visibility = View.INVISIBLE
        }

        showButton.setTextColor(resources.getColor(R.color.green))
        hideButton.setTextColor(resources.getColor(R.color.red))
    }
}
