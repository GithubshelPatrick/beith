package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bancos.*

class BancosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bancos)

        // BtnAppMizrahi.setOnClickListener {
        //     try {
        //         val url ="https://play.google.com/store/apps/details?id=com.MizrahiTefahot.nh&hl=en_US"
        //         val intent=Intent(Intent.ACTION_VIEW,Uri.parse(url))
        //         startActivity(intent)
        //     }catch (ex:ActivityNotFoundException){
        //         val intent=Intent(Intent.ACTION_VIEW, Uri.parse("Market://details?id.MizrahiTefahot.nh&hl=en_US"))
        //     }
        // }

        BtnLigarMizrahi.setOnClickListener{
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$*8860")
            startActivity(intent)
            finish()
        }
        BtnLigarLeumi.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$039545522")
            startActivity(intent)
        }
        BtnLigarHapoalim.setOnClickListener{
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$036532407")
            startActivity(intent)
        }
        BtnLigarDiscount.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$*6111")
            startActivity(intent)
        }

        BtnVoltarBancos.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }


        // AGENCIAS

        BtnAgeMizrahi.setOnClickListener {
            val intent=Intent(this, AgenciasMizrahiActivity::class.java)
            startActivity(intent)
        }
        BtnAgenLeumi.setOnClickListener {
            val intent=Intent(this,AgenciasLeumiActivity::class.java)
            startActivity(intent)
        }
        UrlMizrahi.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mizrahi-tefahot.co.il/"))
            startActivity(i)
        }
        UrlLeumi.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.leumi.co.il"))
            startActivity(i)
        }
        UrlHapoalim.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankhapoalim.co.il/"))
            startActivity(i)
        }
        UrlDiscont.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discountbank.co.il/"))
            startActivity(i)
        }
    }
}
