package com.shelpatrick.a18

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_foto_para_cadastrar.*

class FotoParaCadastrarActivity : AppCompatActivity() {

    val CAMERA_REQUEST_CODE = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto_para_cadastrar)

        CameraDoCadastro.setOnClickListener {
            val callCamera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (callCamera.resolveActivity(packageManager)!=null) {
                startActivityForResult(callCamera, CAMERA_REQUEST_CODE)
            }
        }
        BtnGostei.setOnClickListener {
            val intent=Intent(this,QueroMeCastrarActivity::class.java)
            startActivity(intent)
        }
      //  BtnAcessarGaleriaCad.setOnClickListener {
      //      dispatchGalleryIntent()
      //  }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode){
            CAMERA_REQUEST_CODE ->{
                if (resultCode == Activity.RESULT_OK && data != null){
                    MinhaFot.setImageBitmap(data.extras?.get("data") as Bitmap)

                    //https://www.youtube.com/watch?v=5wbeWN4hQt0
                }
            }
            else->{
                Toast.makeText(this, "É NESCESSARIO DAR PERMISSAO AO USO DA CAMERA" , Toast.LENGTH_LONG).show()
            }
        }
    }


}
