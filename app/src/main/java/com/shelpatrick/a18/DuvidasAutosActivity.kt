package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_duvidas_autos.*

class DuvidasAutosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duvidas_autos)

        BtnVoltardeDuvAutos.setOnClickListener {
            val intent=Intent(this, DuvidasActivity::class.java)
            startActivity(intent)
        }
        BtnHabilitacaoo.setOnClickListener {
            val intent=Intent(this,HabilitacaoActivity::class.java)
            startActivity(intent)
        }
    }
}
