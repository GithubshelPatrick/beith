package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_teudad_zeut_activty.*

class TeudadZeutActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teudad_zeut_activty)

        BtnLigarTeudadZeut.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$*3450")
            startActivity(intent)
        }

        BtnVoltarDaTeudadZeut.setOnClickListener {
            val intent=Intent(this,recemChegadoActivity::class.java)
            startActivity(intent)
        }
    }
}
