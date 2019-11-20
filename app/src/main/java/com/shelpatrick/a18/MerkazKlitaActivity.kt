package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_merkaz_klita.*

class MerkazKlitaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merkaz_klita)

        BtnVoltarDeMerlazKlita.setOnClickListener {
            val intent=Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }


        LigarMerkazAshdod.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$02-620-2780")
            startActivity(intent)
        }
        LigarMerkazBeerSheva.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$08-640-5889")
            startActivity(intent)
        }
        LigarMerkazKarmiel.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$04-902-8217")
            startActivity(intent)
        }
        LigarMerkazRaanana.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:$02-620-2222")
            startActivity(intent)
        }


        WaseMerkazAsdod.setOnClickListener {
            try{

                val url="https://waze.com/ul/hsv8suqe6d"
                val intent=Intent (Intent.ACTION_VIEW,Uri.parse(url))
                startActivity(intent)

            }catch (ex:ActivityNotFoundException){
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse("maket//details?id=com.wase"))
                startActivity(intent)
            }
        }
        WaseMerkazBeerSheva.setOnClickListener {
            try{
                val url="https://waze.com/ul/hsv89z3m3e"
                val intent=Intent (Intent.ACTION_VIEW,Uri.parse(url))
                startActivity(intent)

            }catch (ex:ActivityNotFoundException){
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse("maket//details?id=com.wase"))
                startActivity(intent)
            }
        }
        WaseMerkazKarmiel.setOnClickListener {
            try {
                val url="https://waze.com/ul/hsvc57361s"
                val intent=Intent (Intent.ACTION_VIEW,Uri.parse(url))
                startActivity(intent)

            }catch (ex:ActivityNotFoundException){
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse("maket//details?id=com.wase"))
                startActivity(intent)
            }
        }
        WaseMerkazRaanana.setOnClickListener {
            try {
                val url="https://waze.com/ul/hsv8z13z41"
                val intent=Intent (Intent.ACTION_VIEW,Uri.parse(url))
                startActivity(intent)

            }catch (ex:ActivityNotFoundException){
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse("maket//details?id=com.wase"))
                startActivity(intent)
            }
        }
    }
}
