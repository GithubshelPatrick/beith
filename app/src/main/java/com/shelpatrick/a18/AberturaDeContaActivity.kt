package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_abertura_de_conta.*

class AberturaDeContaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abertura_de_conta)

        BtnIrParaLstaDeBancos.setOnClickListener {
            val intent=Intent(this,BancosActivity::class.java)
            startActivity(intent)
        }

        BtnVoltarDeAberturaDeConta.setOnClickListener {
            val intent=Intent (this,recemChegadoActivity::class.java)
            startActivity(intent)
        }
    }
}
