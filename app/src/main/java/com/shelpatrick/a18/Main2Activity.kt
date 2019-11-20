package com.shelpatrick.a18

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_anunciar_classificados.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        BtnQueroMeCadastrar.setOnClickListener {
            val intent = Intent(this, QueroMeCastrarActivity::class.java)
            startActivity(intent)
        }
        BtnEsqueciSenha.setOnClickListener {
            val intent = Intent(this, EsqueciASenhaActivity::class.java)
            startActivity(intent)
        }
        BtnEntar.setOnClickListener {
            val intent = Intent(this, Menu1Activity::class.java)
            startActivity(intent)
        }



     //   val textoRecuperado = intent.getStringExtra("texto")
     //   Nomezinho.text=textoRecuperado
    }
}

