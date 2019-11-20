package com.shelpatrick.a18

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_anunciar_classificados.*


class AnunciarClassificadosActivity : AppCompatActivity() {

    val CAMERA_REQUEST_CODE = 0
    val GALLERY_REQUEST_CODE = 1
    var imageView: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anunciar_classificados)

        //val value=intent().getExtras()?.getStrinh("KEY"
        //    val bundle = intent.extras
        //    val bundle?.let {
        //     TextoSpinnerTipo.text= it.getString("KEY")
        //}
        // TextoSpinnerTipo.text=value


        BtnOlharAnuncio.setOnClickListener {
            val intent = Intent(this, OlharAnuncioActivity::class.java)
            startActivity(intent)
        }

        photo1.setOnClickListener {
            imageView = it as ImageView
            showAlert()
        }
        photo2.setOnClickListener {
            imageView = it as ImageView
            showAlert()
        }
        photo3.setOnClickListener {
            imageView = it as ImageView
            showAlert()
        }
    }

    fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("O que você prefere ?")
        builder.setMessage("Tirar uma foto ou escolher uma de sua galeria ?")
        builder.setPositiveButton("Galeria") { _, _ ->
            openGallery()
        }
        builder.setNegativeButton("Camera") { _, _ ->
            openCamera()

        }
        val alertDialog = builder.create()
        alertDialog.show()
    }

    fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Choose picture"), GALLERY_REQUEST_CODE)
    }

    fun openCamera() {
        val callCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if (callCamera.resolveActivity(packageManager) != null) {
            startActivityForResult(callCamera, CAMERA_REQUEST_CODE)
        }
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK && data != null) {
                    imageView?.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            GALLERY_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK && data != null) {
                    val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, data.data) as Bitmap
                    imageView?.setImageBitmap(bitmap)
                }
            }
            else -> {
                Toast.makeText(this, "É NESCESSARIO DAR PERMISSAO AO USO DA CAMERA", Toast.LENGTH_LONG).show()
            }
        }
    }

}
