package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_videos.*

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        BtnVoltarDeVideos.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnCanais.setOnClickListener {
            val intent=Intent(this,CanaisActivity::class.java)
            startActivity(intent)
        }
        BtnCuriosidades.setOnClickListener {
            val intent=Intent(this,CuriosidadesActivity::class.java)
            startActivity(intent)
        }
    }
}
