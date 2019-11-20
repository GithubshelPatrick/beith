package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_duvidas.*

class DuvidasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duvidas)

        BtnVoltarDeDuvidas.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnMandeSuaPerguninha.setOnClickListener {
            val intent=Intent(this,FaleConoscoActivity::class.java)
            startActivity(intent)
        }
        BtnDuvidasAutos.setOnClickListener {
            val intent=Intent(this,DuvidasAutosActivity::class.java)
            startActivity(intent)
        }
    }
}
