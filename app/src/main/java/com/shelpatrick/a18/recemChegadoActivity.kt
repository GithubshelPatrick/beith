package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recem_chegado.*

class recemChegadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recem_chegado)

        BtnSeguroSaude.setOnClickListener {
            val intent=Intent(this, SeguroDeSaudeActivity::class.java)
            startActivity(intent)
        }
        BtnTeudadZeut.setOnClickListener {
            val intent=Intent(this, TeudadZeutActivty::class.java)
            startActivity(intent)
        }
        BtnCertificadoDeOle.setOnClickListener {
            val intent=Intent(this,CertificadoDeOleActivity::class.java)
            startActivity(intent)
        }
        BtnAberturaDeConta.setOnClickListener {
            val intent=Intent(this,AberturaDeContaActivity::class.java)
            startActivity(intent)
        }
        BtnAjudaFinaceira.setOnClickListener {
            val intent=Intent(this,AjudaFinanceiraActivity::class.java)
            startActivity(intent)
        }
        BtnVoltarRecemChegado.setOnClickListener {
            val intent=Intent(this,BeneficiosActivity::class.java)
            startActivity(intent)
        }
        BtnUlpanzinho.setOnClickListener {
            val intent=Intent(this, UlpanActivity::class.java)
            startActivity(intent)
        }
        BtnIscricaoDeFilhos.setOnClickListener {
            val intent=Intent(this, InscricaoDeFilhosActivity::class.java)
            startActivity(intent)
        }
    }
}
