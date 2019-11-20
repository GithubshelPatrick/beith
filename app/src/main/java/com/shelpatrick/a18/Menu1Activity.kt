package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu1.*
import kotlinx.android.synthetic.main.activity_telefones_uteisctivity.*

class Menu1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        BtnTelefonesUteis.setOnClickListener {
            val intent= Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        BtnClassificados.setOnClickListener {
            val intent= Intent(this,ClassificadosMenuActivity::class.java)
            startActivity(intent)
        }
        BtnSaude.setOnClickListener {
            val intent= Intent(this,PlanosDeSaudeActivity::class.java)
            startActivity(intent)
        }
        BtnBancos.setOnClickListener {
            val intent= Intent (this, BancosActivity::class.java)
            startActivity(intent)
        }
        BtnDica.setOnClickListener {
            val intent= Intent(this, DicasActivity::class.java)
            startActivity(intent)
        }
        BtnApps.setOnClickListener {
            val intent= Intent(this, AppRecomendaveisActivity::class.java)
            startActivity(intent)
        }
        BtnBeneficios.setOnClickListener {
            val intent= Intent(this, BeneficiosActivity::class.java)
            startActivity(intent)
        }
        BtnCorreios.setOnClickListener {
            val intent= Intent(this,CorreiosActivity::class.java)
            startActivity(intent)
        }
        BtnPaginasNoFaceBook.setOnClickListener {
            val intent= Intent(this,PaginasFaceBookActivity::class.java)
            startActivity(intent)
        }
        BtnDuvidas.setOnClickListener {
            val intent=Intent(this,DuvidasActivity::class.java)
            startActivity(intent)
        }
        BtnVideos.setOnClickListener {
            val intent=Intent(this,VideosActivity::class.java)
            startActivity(intent)
        }
        BtnPaginasNoFaceBook.setOnClickListener {
            val intent=Intent(this,FacebbokActivity::class.java)
            startActivity(intent)
        }
        BtnFaleConosco.setOnClickListener {
            val intent=Intent(this,FaleConoscoActivity::class.java)
            startActivity(intent)
        }
         ImagPropaganda.setOnClickListener {
             try {
                 val url="https://www.facebook.com/chefmamu/"
                 val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
                 startActivity(intent)
             } catch (ex: ActivityNotFoundException) {
                 // se nao tiver o aap instalado, abra no Google Play:
                 val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.faceboook"))
                 startActivity(intent)
             }
         }
    }
}
