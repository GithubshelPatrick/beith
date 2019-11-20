package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bancos.*
import kotlinx.android.synthetic.main.activity_planos_de_saude.*

class PlanosDeSaudeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planos_de_saude)

        BtnVoltarDePlanoDeSaude.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        ImgLigarMacabi.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ *3555")
            startActivity(intent)
            finish()
        }
        ImgLigarClalit.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ 03-633333")
            startActivity(intent)
        }
        ImgLigarMeuhedet.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ *3833")
            startActivity(intent)
        }
        ImgLigarLeumit.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$ *507")
            startActivity(intent)
        }
        BtnProfissionaisbr.setOnClickListener {
            val intent=Intent(this,ProfissionaisBrActivity::class.java)
            startActivity(intent)
        }
        ImgProfissionaisBR.setOnClickListener {
            val intent=Intent(this,ProfissionaisBrActivity::class.java)
            startActivity(intent)
        }
        UrlMacabi.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://go.maccabi4u.co.il"))
            startActivity(i)
        }
        UrlClalit.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://clalit-info.co.il"))
            startActivity(i)
        }
        UrlLeumittttttt.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://leumit.co.il"))
            startActivity(i)
        }
    }
}
