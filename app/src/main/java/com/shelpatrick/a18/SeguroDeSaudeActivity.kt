package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seguro_de_saude.*

class SeguroDeSaudeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seguro_de_saude)

        BtnVoltarDoSeguroDeSaude.setOnClickListener {
            val intent=Intent(this, recemChegadoActivity::class.java)
            startActivity(intent)
        }

        BtnLigarKupatCholim.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ *3450")
            startActivity(intent)
        }
    }
}
