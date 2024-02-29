package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.os.Handler

class HomeScreen : AppCompatActivity() {
    private lateinit var pizzaButton: Button
    private lateinit var englishButton: Button
    private lateinit var frenchButton: Button
    private lateinit var spanishButton: Button
    private lateinit var latinButton: Button
    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        pizzaButton = findViewById(R.id.button)
        englishButton = findViewById(R.id.button2)
        frenchButton = findViewById(R.id.button3)
        spanishButton = findViewById(R.id.button4)
        latinButton = findViewById(R.id.button5)
        text = findViewById(R.id.textView)

        pizzaButton.setOnClickListener{
            var intent2 = Intent(this,HomeScreenItalian::class.java)
            startActivity(intent2)
            finish()
            //text.setText(R.string.hello_world_italian)
        }

        englishButton.setOnClickListener{
            text.setText(R.string.hello_world)
        }

        frenchButton.setOnClickListener{
            text.setText(R.string.hello_world_french)
        }

        spanishButton.setOnClickListener{
            text.setText(R.string.hello_world_spanish)
        }

        latinButton.setOnClickListener{
            text.setText(R.string.hello_world_latin)
        }

    }
}