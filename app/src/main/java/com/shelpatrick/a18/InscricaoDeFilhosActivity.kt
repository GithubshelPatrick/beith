package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inscricao_de_filhos.*

class InscricaoDeFilhosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscricao_de_filhos)

        BtnVoltarDeIscricao.setOnClickListener {
            val intent=Intent(this,recemChegadoActivity::class.java)
            startActivity(intent)
        }
    }
}
