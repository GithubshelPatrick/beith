package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beneficio_pesquisa_por_tipo.*
import kotlinx.android.synthetic.main.activity_beneficios.*

class BeneficioPesquisaPorTipoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beneficio_pesquisa_por_tipo)

        BtnVoltardePesquisaTipo.setOnClickListener {
            val intent=Intent(this, BeneficiosActivity::class.java)
            startActivity(intent)
        }
    }
}
