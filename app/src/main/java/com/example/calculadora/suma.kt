package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class suma : AppCompatActivity() {
lateinit var n1 : EditText
    lateinit var n2 : EditText
    lateinit var btn_suma : Button
    lateinit var txt_resultado : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        n1=findViewById(R.id.n1)
        n2=findViewById(R.id.n2)
        btn_suma=findViewById(R.id.btn_suma)
        txt_resultado=findViewById(R.id.txt_resultado)
        btn_suma.setOnClickListener(View.OnClickListener {
            val num1=Integer.parseInt(n1.text.toString())
            val num2=Integer.parseInt(n2.text.toString())
            txt_resultado.setText("El resultado es:   "   + (num1+num2))

        })

    }



}