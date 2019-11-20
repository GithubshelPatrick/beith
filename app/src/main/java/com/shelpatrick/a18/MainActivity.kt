package com.shelpatrick.a18

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_menu1.*

class MainActivity : AppCompatActivity() {
    val Splash_Screen = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)

        Handler().postDelayed( object : Runnable{
            override fun run (){
                val home = Intent(this@MainActivity,Main2Activity::class.java)
                startActivity(home)
                finish()
            }
        },Splash_Screen.toLong())
    }
}
