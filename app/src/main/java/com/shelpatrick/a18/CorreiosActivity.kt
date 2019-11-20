package com.shelpatrick.a18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_correios.*

class CorreiosActivity : AppCompatActivity() {
    lateinit var agencia:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correios)

        BtnMostrarAgenciasDeCorreio.setOnClickListener{
            val intent=Intent(this,CorreioAgenciasActivity::class.java)
            startActivity(intent)
        }
        BtnVoltarDosCorreios.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }

        agencia=findViewById(R.id.SpinnerdeCidades)

        var agencias = arrayListOf("Escolha a cidade ","Acre", "Arad ", "Ashdod","Bat Yam","Benei Braq", "Beer Sheva ","Beit Shemesh ","Carmiel ",
            "Cesareia ", "Dimona",  "Eiltat", "El Ad","Givat Shmuel", "Givataym", "Haifa ","Hedera","hertzlya", "Hod Ha Sharon", "Holon ",
            "Jafa", "Jerusalém ","Kfar Qasim","Kfar Giladi", "Kfar Saba ","Kfar Shmaryahu","Kneret","Lida","Ma'alot-Tarshiha","Migdal HaEmeq",
            "Moddim","Modiim Macabim Reut","Naharia","Nazaré", "Nesher","Ness Ziona", "Netanya","Netivot","Ofakim","Or Akiva","Or Yehuda ",
            "Petah Tikva ","Qriat Atta", "Qriat Bialik", "Qriat Gat", "Qriat Malakhi","Qriat Motzkin","Qriat Ono ","Qriat Yam ", "Qriat Shmoná",
            "Raanana", "Ramat Gan ","Ramat Hasharon","Ramla ","Rerovot ","Rishon Le Tzion", "Rosh Ha Aym ","Sderot", "Tel Aviv","Yavne"," Yehud", "Monosson" )
        agencia.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,agencias)

        UrlCorreios.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.israelpost.co.il/"))
            startActivity(i)
        }

    }
}
