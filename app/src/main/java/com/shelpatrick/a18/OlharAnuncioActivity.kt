package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_olhar_anuncio.*

class OlharAnuncioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olhar_anuncio)

        BtnConfirmarPublicacaoAuncio.setOnClickListener ({
            Toast.makeText(applicationContext,"Aguarde em breve seu anúncio será publícado",Toast.LENGTH_LONG).show();
            val intent=Intent(this,ClassificadosMenuActivity::class.java)
            startActivity(intent)
        })
    }
}
