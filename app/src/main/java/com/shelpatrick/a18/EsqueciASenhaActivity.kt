package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_esqueci_asenha.*

class EsqueciASenhaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esqueci_asenha)

        BtnReeviarSenha.setOnClickListener ({
            Toast.makeText(applicationContext,"Estamo reeviando a senha, aguarde", Toast.LENGTH_LONG).show();
        })

        BtnVoltarTelaLogin.setOnClickListener {
            val intent= Intent(this,Main2Activity::class.java)
            startActivity(intent)

        }
    }
}
