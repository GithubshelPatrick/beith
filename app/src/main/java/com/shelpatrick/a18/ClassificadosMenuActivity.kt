package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_classificados_menu.*

class ClassificadosMenuActivity : AppCompatActivity() {
    lateinit var produto: Spinner
    var selectedString=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classificados_menu)

        produto =findViewById(R.id.SpinerTipo)


        var produtos = arrayListOf("ESCOLHA UMA DAS OPÇÕES ", "Alimentos","Autos","Doacào",
            "Emprego","Imovéis ","Pet","Produtos","Servicos","outros")
        produto.adapter=ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,produtos)

        BtnVoltarDosClassificados.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)


        }
        BtnAnunciar.setOnClickListener{
            val intent=Intent(this, AnunciarClassificadosActivity::class.java)
            val bundle = Bundle()
            bundle.putString("KEY", selectedString)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        BtnProcurarClassificados.setOnClickListener {
            val intent=Intent (this, ProcurarClassificadosActivity::class.java)
            startActivity(intent)
        }
    }

}
