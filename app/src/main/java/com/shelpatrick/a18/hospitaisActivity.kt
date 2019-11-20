package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_hospitais.*

class hospitaisActivity : AppCompatActivity() {
    lateinit var produto: Spinner
    lateinit var nomehospital: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitais)

        BtnVoltarDeHospitais.setOnClickListener {
            val intent=Intent(this,TelefonesUteisctivity::class.java)
            startActivity(intent)
        }
        produto = findViewById(R.id.SpinerHospitaisCidades)

        var produtos = arrayListOf( "Escolha a cidade ","Acre", "Arad ", "Ashdod","Bat Yam","Benei Braq", "Beer Sheva ","Beit Shemesh ","Carmiel ",
            "Cesareia ", "Dimona",  "Eiltat", "El Ad","Givat Shmuel", "Givataym", "Haifa ","Hedera","hertzlya", "Hod Ha Sharon", "Holon ",
            "Jafa", "Jerusalém ","Kfar Qasim","Kfar Giladi", "Kfar Saba ","Kfar Shmaryahu","Kneret","Lida","Ma'alot-Tarshiha","Migdal HaEmeq",
            "Moddim","Modiim Macabim Reut","Naharia","Nazaré", "Nesher","Ness Ziona", "Netanya","Netivot","Ofakim","Or Akiva","Or Yehuda ",
            "Petah Tikva ","Qriat Atta", "Qriat Bialik", "Qriat Gat", "Qriat Malakhi","Qriat Motzkin","Qriat Ono ","Qriat Yam ", "Qriat Shmoná",
            "Raanana", "Ramat Gan ","Ramat Hasharon","Ramla ","Rerovot ","Rishon Le Tzion", "Rosh Ha Aym ","Sderot", "Tel Aviv","Yavne"," Yehud", "Monosson" )
        produto.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, produtos)


        nomehospital = findViewById(R.id.SpinnerHospitaisNome)

        var nomehospitais = arrayListOf("	Alyn Woldenberg	",
            "	Assuta Haifa	",
            "	Assuta Hospital Ramat HaHayal	",
            "	Assuta Samson Univercity	",
            "	Baruch Padeh 	",
            "	Centro Medico Hertzelya	",
            "	Elisha Hospial	",
            "	Emms Nazareth	",
            "	Gara Clinic	",
            "	hadassah Ein Keren	",
            "	Herzog 	",
            "	Holy Family	",
            "	Kaplan centro medico	",
            "	Laniado Hospital	",
            "	Meir Medical	",
            "	Misgav Ladach 	",
            "	Rambam Medical Center	",
            "	Shaare Zedek Medical Center	",
            "	Sheba Medical Center	",
            "	SouraskyCentro Medico 	",
            "	st John of Jerusalem Eye Hospital	",
            "	Ziv Centro Medico	")
        nomehospital.adapter= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, nomehospitais)
    }
}
