package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn_suma = findViewById<Button>(R.id.btn_suma)
        btn_suma.setOnClickListener {
            val suma = Intent(this, suma::class.java)
            startActivity(suma)
        }




    }
}