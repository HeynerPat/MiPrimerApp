package com.example.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val cbDev = findViewById<CheckBox>(R.id.cbDeveloper)
        bSaludar.setOnClickListener(View.OnClickListener {
            if(validaDato()){

                if(cbDev.isChecked){
                    Toast.makeText( this, "Bienvenido, " + etNombre.text + ", Sé que eres un desarrollador", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText( this, "Bienvenido, " + etNombre.text, Toast.LENGTH_LONG).show()
                }

            }else{
                Toast.makeText( this, "Escribe tu Nombre para Saludarte :/", Toast.LENGTH_LONG).show()
            }

        })
    }

    fun validaDato(): Boolean{
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val nombreUsuario = etNombre.text

        if(nombreUsuario.isNullOrEmpty()){
            return false
        }
        return true
    }
}