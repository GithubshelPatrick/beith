package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_beneficios.*

class BeneficiosActivity : AppCompatActivity() {
    lateinit var produto: Spinner
    lateinit var idade: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beneficios)

        produto = findViewById(R.id.SpinnerCoisasBeneficios)


        var produtos = arrayListOf(
            "Selecione uma opção",
            "Alúguel",
            "Arnona",
            "Compra de carro",
            "Compra de imovel",
            "Conta de água",
            "Conta de gás ",
            "Conta de luz ",
            "Cursos",
            "Ulpan"
        )
        produto.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, produtos)

        idade = findViewById(R.id.SpinnerDaIdade)

        var idades = arrayListOf("Selecione a idade", "De 01 mês a 05 anos ", "De 05 anos a 10 anos ")
        idade.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, idades)


        BtnRecemChegado.setOnClickListener {
            val intent = Intent(this, recemChegadoActivity::class.java)
            startActivity(intent)
        }
        BtnVoltarDeBeneficios.setOnClickListener {
            val intent = Intent(this, Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnPesquisaTipo.setOnClickListener {
            val intent=Intent(this,BeneficioPesquisaPorTipoActivity::class.java)
            startActivity(intent)
        }
    }
}