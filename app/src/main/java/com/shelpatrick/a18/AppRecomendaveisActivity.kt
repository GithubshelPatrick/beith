package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app_recomendaveis.*

class AppRecomendaveisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_recomendaveis)

        BtnVoltardeApps.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnVoltardeAppsImg.setOnClickListener{
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
    }
}
