package com.example.myindividualapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textName=findViewById<EditText>(R.id.textName)
        val TextLastName=findViewById<EditText>(R.id.TextLastName)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button1=findViewById<Button>(R.id.button1)
            button1.setOnClickListener {
                tv1.text = "Nombre: ${textName.text}, Apellido: ${TextLastName.text}"
            }
        }

    }


