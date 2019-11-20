package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_gastronomia.*

class GastronomiaActivity : AppCompatActivity() {
    lateinit var gastronomia:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastronomia)

        BtnVoltarDeGastronomia.setOnClickListener {
            val intent=Intent(this,DicasActivity::class.java)
            startActivity(intent)
        }

        gastronomia=findViewById(R.id.SpinnerGastro)

        var gastronomias= arrayListOf("SELECIONE AQUI", "Acre", "Arad ",
            "Ashdod","Bat Yam","Benei Braq", "Beer Sheva ","Beit Shemesh ","Carmiel ", "Cesareia ",
            "Dimona",  "Eiltat", "El Ad","Givat Shmuel", "Givataym","Golan", "Haifa ","Hedera","Hertzlya",
            "Hod Ha Sharon", "Holon ", "Jafa", "Jerusalém ","Kfar Qasim","Kfar Giladi", "Kfar Saba ",
            "Kfar Shmaryahu","Kneret","Lida","Ma'alot-Tarshiha","Migdal HaEmeq","Moddim","Modiim Macabim Reut",
            "Naharia","Nazaré", "Nesher","Ness Ziona", "Netanya","Netivot","Ofakim","Or Akiva","Or Yehuda ",
            "Petah Tikva ","Qriat Atta", "Qriat Bialik", "Qriat Gat", "Qriat Malakhi","Qriat Motzkin","Qriat Ono ",
            "Qriat Yam ", "Qriat Shmoná",  "Raanana", "Ramat Gan ","Ramat Hasharon","Ramla ","Rerovot ",
            "Rishon Le Tzion", "Rosh Ha Aym ","Sderot", "Tel Aviv","Ÿavne", "Yehud", "Monosson" )
        gastronomia.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,gastronomias)
    }
}
