package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ulpan_enderecos.*

class UlpanEnderecosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulpan_enderecos)

        BtnVoltardeUlpanEbdereco.setOnClickListener {
            val intent=Intent(this, TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
    }
}
