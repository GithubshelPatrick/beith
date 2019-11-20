package com.shelpatrick.a18

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fale_conosco.*


class FaleConoscoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fale_conosco)

        BtnEnviarUmEmail.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.type = "message/rfc822"
            i.putExtra(Intent.EXTRA_EMAIL, arrayOf("emailshelpatrick@gmail.com"))
            i.putExtra(Intent.EXTRA_SUBJECT, "Mandado pelo APP")
            i.putExtra(Intent.EXTRA_TEXT, editText11.text.toString())
            try {
                startActivity(Intent.createChooser(i, "Send mail..."))
            } catch (ex: android.content.ActivityNotFoundException) {
                Toast.makeText(this, "Seu e-mail foi enviado.", Toast.LENGTH_SHORT).show()
            }

        }

        BtnVoltarDeFaleconosco.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        //BtnEnviarUmEmail.setOnClickListener ({
        //    Toast.makeText(applicationContext,"Sua sujestão está sendo enviada, Agradecemos a sua atenção",Toast.LENGTH_LONG).show();
        //})
    }

}
