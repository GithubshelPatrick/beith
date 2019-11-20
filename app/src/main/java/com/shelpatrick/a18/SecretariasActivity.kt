package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secretarias.*
import kotlinx.android.synthetic.main.activity_telefones_uteisctivity.*

class SecretariasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secretarias)

        BtnVoltarDeSecretaria.setOnClickListener {
            val intent=Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        BtnHaRichui.setOnClickListener {
            val intent=Intent(this, HaRishuiActivity::class.java)
            startActivity(intent)
        }
    }
}
