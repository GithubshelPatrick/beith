package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_canais.*
import kotlinx.android.synthetic.main.activity_planos_de_saude.*

class CanaisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canais)

        BtnVoltarDeCanais.setOnClickListener {
            val intent=Intent(this,VideosActivity::class.java)
            startActivity(intent)
        }
        UrlCanalDoRafael.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=rafael+guanabara"))
            startActivity(i)
        }
        UrlCanalRealidade.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCiYbbgJQMYynYgFtKSIOXAA"))
            startActivity(i)
        }
        UrlCanalDaViviane.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCMYUzx9fyYgdwCm_LJvw8fQ"))
            startActivity(i)
        }
        UrlCanalDaIlana.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCaNVg8KQPn8vPpBUm6odm0g"))
            startActivity(i)
        }

    }
}
