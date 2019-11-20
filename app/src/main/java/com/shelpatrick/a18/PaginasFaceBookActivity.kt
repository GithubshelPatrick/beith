package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_facebbok.*

class PaginasFaceBookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paginas_face_book)

        BtnVoltarDePgFacebook.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
    }
}
