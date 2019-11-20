package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_agencias_leumi.*
import kotlinx.android.synthetic.main.activity_bancos.*

class AgenciasLeumiActivity : AppCompatActivity() {
    lateinit var agLeumi:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agencias_leumi)

        agLeumi=findViewById(R.id.SpinnerLeumi)

        var agLeumis= arrayListOf(
            "	Azor	           Herzl 3"	,
            "	Bat Yam	           Balfour 80"	,
            "	Bnei Brak	       Chason Ish 54"	,
            "	Bnei Brak	       David Ben Gurion 13"	,
            "	Eilat	           Sderot HaTmarim"	,
            "	Givataym	       Katzenelson 67"	,
            "	Givataym	       HaRav Herzog 23"	,
            "	Hedera	           Shivat Tsiyon 1"	,
            "	Herzlya            Ben Gurion 2"	,
            "	Herzlya	           Maskit 32"	,
            "	Hod Ha Sharon	   Ha Banim 7"	,
            "	Holon	           Ha-Mashbir 1"	,
            "	Holon	           Eilat 36"	,
            "	Holon	           Pinkhas Eilon 13	"	,
            "	Holon	           Sokolov 45	"	,
            "	Jerusalém	       natan Strauss 29	"	,
            "	Jerusalém	       king David 19	"	,
            "	Jerusalém	       Herbon 101	"	,
            "	Jerusalém	       King George 22	"	,
            "	Jerusalém	       Jaffa 208	"	,
            "	Jerusalém	       Ha Pisga 17	"	,
            "	Jerusalém	       Nachal Zoah 3	"	,
            "	Jerusalém	       Kriyat Ha Mada 3	"	,
            "	Jerusalém	       Uruguai 1	"	,
            "	Jerusalém	       Kanfei Nesharim 13	"	,
            "	Jerusalém	       Rambam 21	"	,
            "	Jerusalém	       Har El 10	"	,
            "	Jerusalém	       Khananya 4	"	,
            "	Jerusalém	       Hertzl Blvd 106	"	,
            "	Kfar Qasem 	       Ali Ben Abu Taleb	"	,
            "	Kfar Saba	       Weizmann 101	"	,
            "	Kfar Shmayahu	   Ha-Ma'apilim 5	"	,
            "	Modiin 	           Tze'elon 21	"	,
            "	Kryat Ono	       Zeidman 2	"	,
            "	Netanya	           Zalman Shazar 10	"	,
            "	Netanya	           Zoran 4	"	,
            "	Netanya 	       Yehoshu'a Shtampfer 9	"	,
            "	Netanya	           Hertzl 33	"	,
            "	Petah Tikva	       Sutim 4	"	,
            "	Petah Tikva	       Khayim Soutin 4	"	,
            "	Petah Tikva	       Rothschild St 76	"	,
            "	Raanana	           Ahuza 152	"	,
            "	Raanana	           Ha Tidhar 2	"	,
            "	Ramat Gan 	       Menachem Begin 7	"	,
            "	Ramat Gan	       Bialik 22	"	,
            "	Ramat Gan	       Shoham 2	"	,
            "	Ramat Gan	       Ha-Yarden 79	"	,
            "	Rishon Letzion	   Moshe Levi 11	"	,
            "	Rmat Hasharon	   Sokolov 69	"	,
            "	Rosh Haayn	       Moshe Dayan 2	"	,
            "	Rosh Haayn	       HaMerEts St 7	"	,
            "	Tel Aviv	       Ha Barzel  7	"	,
            "	Tel Aviv	       Brodetsky 43	"	,
            "	Tel Aviv	       Einstein 7	"	,
            "	Tel Aviv	       Kehilat Saloniki 7	"	,
            "	Tel Aviv	       Aba Akhime'ir 21	"	,
            "	Tel Aviv     	   Jerusalem Blvd 19	"	,
            "	Tel Aviv	       Elifelet St 26	"	,
            "	Tel Aviv	       Sderot Har Tsiyon 10	"	,
            "	Tel Aviv	       Dizengoff 55	"	,
            "	Tel Aviv	       Pinkas 48	"	,
            "	Tel Aviv	       Emek Brakha 23	"	,
            "	Tel Aviv	       Shlomo Ibn Gabirol 71	"	,
            "	Tel Aviv	       Allenby 43	"	,
            "	Tel Aviv	       Hertzl 19	"	,
            "	Tel Aviv	       La Guardia 76	"	,
            "	Tel Aviv	       Montefiore 31	"	,
            "	Tel Aviv	       Ha Arbaa 28	"	,
            "	Tel Aviv	       Ha-Shlosha 9	"	,
            "	Tel Aviv	       Lincon 20	"	,
            "	Tel Aviv	       Yehuda ha-Levi 35	"	,
            "	Tel Mond	       Ha-Dekel 52א	"	,
            "	Yahud Monoson	   Derech HaAtsma'ut 54	"	 )

        agLeumi.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,agLeumis)



        BtnVoltarAgenciasLeumi.setOnClickListener {
            val intent=Intent(this,BancosActivity::class.java)
            startActivity(intent)
        }
    }

}
