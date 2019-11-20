package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_curiosidades.*

class CuriosidadesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curiosidades)

        BtnVoltarDeCuriosidades.setOnClickListener {
            val intent=Intent(this,VideosActivity::class.java)
            startActivity(intent)
        }
    }
}
