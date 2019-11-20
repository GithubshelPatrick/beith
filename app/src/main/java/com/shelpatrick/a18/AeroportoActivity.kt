package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aeroporto.*

class AeroportoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aeroporto)

        BtnVoltarDeAerportos.setOnClickListener {
            val intent=Intent(this, TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        BtnLigarBenGurion.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ 03-972-3333")
            startActivity(intent)
        }
        BtnLigarEilat.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$ 08-63633205")
            startActivity(intent)
        }

        WazeBenGurion.setOnClickListener {
            try {
                // para abrir o ease com o end do aeroporto terminal3:
                val url = "https://waze.com/ul?q=Terminal3BenGurion"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.waze"))
                startActivity(intent)
            }
        }
        UrlDoBenGurion.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW,Uri.parse( "http://www.iaa.gov.il"))
            startActivity(i)
        }
        UrlDoAeroportoEilat.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW,Uri.parse( "http://www.iaa.gov.il"))
            startActivity(i)
        }
    }
}
