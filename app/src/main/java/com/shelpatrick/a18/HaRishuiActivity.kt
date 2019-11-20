package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ha_rishui.*

class HaRishuiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ha_rishui)

        BtnVoltarDeHaRishui.setOnClickListener {
            val intent=Intent(this, SecretariasActivity::class.java)
            startActivity(intent)
        }
    }
}
