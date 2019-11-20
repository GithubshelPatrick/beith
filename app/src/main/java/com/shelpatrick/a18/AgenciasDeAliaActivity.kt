package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agencia_de_alia.*

class AgenciasDeAliaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agencia_de_alia)

        BtnVoltarDasAgencias.setOnClickListener {
            val intent=Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        BtnLigarAgJudaica.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ 005511-3518-8777")
            startActivity(intent)
        }
        BtnLigarGlobalCenter.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ 0800-891-8023")
            startActivity(intent)
        }
        UrlAgJudaica.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("http://archive.jewishagency.org/pt/"))
            startActivity(i)
        }
        UrlKeren.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://yedidout.org/pt/contato/)"))
            startActivity(i)
        }
        UrlGlobalCenter.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("http://archive.jewishagency.org/pt/aliyah/program/7039"))
            startActivity(i)
        }
    }
}
