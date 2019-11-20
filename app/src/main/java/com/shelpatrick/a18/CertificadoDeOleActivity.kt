package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_certificado_de_ole.*

class CertificadoDeOleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certificado_de_ole)

        BtnVoltarDeCertificado.setOnClickListener {
            val intent=Intent(this, recemChegadoActivity::class.java)
            startActivity(intent)
        }
    }
}
