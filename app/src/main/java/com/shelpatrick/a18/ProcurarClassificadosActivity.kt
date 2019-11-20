package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_procurar_classificados.*

class ProcurarClassificadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procurar_classificados)

        BtnVoltarDeProcura.setOnClickListener {
            val intent=Intent(this, ClassificadosMenuActivity::class.java)
            startActivity(intent)
        }

    }
}
