package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_telefones_uteisctivity.*

class TelefonesUteisctivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefones_uteisctivity)

        BtnVoltarDeTelefoneUtil.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnAeroporto.setOnClickListener {
            val intent=Intent(this,AeroportoActivity::class.java)
            startActivity(intent)
        }
        BtnBancodois.setOnClickListener {
            val intent=Intent(this, BancosActivity::class.java)
            startActivity(intent)
        }
        BtnConsulado.setOnClickListener {
            val intent=Intent(this,ConsuladoActivity::class.java)
            startActivity(intent)
        }
        BtnAgDeAliah.setOnClickListener {
            val intent=Intent(this, AgenciasDeAliaActivity::class.java)
            startActivity(intent)
        }
        BtnHospitais.setOnClickListener {
            val intent=Intent(this, hospitaisActivity::class.java)
            startActivity(intent)
        }
        BtnSecretaria.setOnClickListener {
            val intent=Intent(this,SecretariasActivity::class.java)
            startActivity(intent)
        }
        BtnMerkaz.setOnClickListener {
            val intent=Intent(this,MerkazKlitaActivity::class.java)
            startActivity(intent)
        }
        BtnUlpan.setOnClickListener {
            val intent=Intent(this, UlpanEnderecosActivity::class.java)
            startActivity(intent)
        }
    }
}
