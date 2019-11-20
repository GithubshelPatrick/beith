package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quero_me_castrar.*
import kotlinx.android.synthetic.main.activity_termos.*

class TermosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_termos)

        BtnConfirmarCadastro.setOnClickListener {
            val intent=Intent(this,Main2Activity::class.java)
           // val params= Bundle()
           // val textoDigitado = NomeCriado.text.toString()

       //     params.putString("texto", textoDigitado)

         //   intent.putExtras(params)
            startActivity(intent)
        }
    }
}
