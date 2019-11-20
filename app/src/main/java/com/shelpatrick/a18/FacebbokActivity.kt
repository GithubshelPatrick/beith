package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_facebbok.*

class FacebbokActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebbok)

        BtnVoltarDePgFacebook.setOnClickListener {
            val intent= Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        LinkBeithBrasil.setOnClickListener {
            try {

                val url = "https://www.facebook.com/beit.brasil.3/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkOlimDoBrasil.setOnClickListener {
            try {

                val url = "https://www.facebook.com/groups/264597080619949/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkdaKehila.setOnClickListener {
            try {

                val url = "https://www.facebook.com/groups/1659920234331425/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkDoBeithJobs.setOnClickListener {
            try {

                val url = "https://www.facebook.com/groups/beitbrasiljobs/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkDocirculo.setOnClickListener {
            try {
                val url = "https://www.facebook.com/groups/375888879228155/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkDoBrazukas.setOnClickListener {
            try {
                val url = "https://www.facebook.com/groups/1113885685349633/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }
        LinkDoCozinhando.setOnClickListener {
            try {
                val url = "https://www.facebook.com/groups/1435734633368689/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // se nao tiver o aap instalado, abra no Google Play:
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.Facebook"))
                startActivity(intent)
            }
        }

    }
}
