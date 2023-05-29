package com.example.calculadora
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val menu = Intent(this, menu::class.java)
            startActivity(menu)
        }

        val btn_salir =findViewById<Button>(R.id.btn_salir)
        btn_salir.setOnClickListener{
            finish()

        }
}
}