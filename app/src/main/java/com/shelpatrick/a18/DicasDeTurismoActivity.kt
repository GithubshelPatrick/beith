package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dicas_de_turismo.*

class DicasDeTurismoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dicas_de_turismo)

        BtnVoltarDeDicasDeTurismo.setOnClickListener {
            val intent=Intent(this,DicasActivity::class.java)
            startActivity(intent)
        }
    }
}
