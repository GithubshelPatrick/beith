package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dicas.*

class DicasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dicas)

        BtnVoltarDeDicas.setOnClickListener {
            val intent = Intent(this, Menu1Activity::class.java)
            startActivity(intent)
        }

        BtnDicasTurismo.setOnClickListener {
            val intent = Intent(this, DicasDeTurismoActivity::class.java)
            startActivity(intent)
        }
        BtnTurImg.setOnClickListener {
            val intent = Intent(this, DicasDeTurismoActivity::class.java)
            startActivity(intent)
        }


        BtnDicasPromocoes.setOnClickListener {
            val intent = Intent(this, DicasPromocoesActivity::class.java)
            startActivity(intent)
        }
        BtnPromoImg.setOnClickListener {
            val intent = Intent(this, DicasPromocoesActivity::class.java)
            startActivity(intent)
        }



        BtnDicasEvento.setOnClickListener {
            val intent = Intent(this, DicasDeEventosActivity::class.java)
            startActivity(intent)
        }
        BtnEvenImg.setOnClickListener {
            val intent = Intent(this, DicasDeEventosActivity::class.java)
            startActivity(intent)
        }



        BtnDicasGastronomia.setOnClickListener {
            val intent = Intent(this, GastronomiaActivity::class.java)
            startActivity(intent)
        }
        BtnGastroImg.setOnClickListener {
            val intent = Intent(this, GastronomiaActivity::class.java)
            startActivity(intent)
        }
    }
}
