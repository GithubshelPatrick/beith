package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aeroporto.*
import kotlinx.android.synthetic.main.activity_consulado.*

class ConsuladoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulado)

        BtnVoltarDeConsulado.setOnClickListener {
            val intent=Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        ImgLigarConsulado.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ 03-7971500")
            startActivity(intent)
        }
        WazeConsulado.setOnClickListener {
            try {
                // para abrir o ease com o end do aeroporto terminal3:
                val url = "https://waze.com/ul/hsv8wrhwuw"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.waze"))
                startActivity(intent)
            }


        }
        UrlConsulado.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("http://telaviv.itamaraty.gov.br/pt-br/"))
            startActivity(i)
        }
    }
}
