package com.example.job16bowo

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome To Jobsheet16", Toast.LENGTH_SHORT).show()

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val biodata = arrayOf("Bowo Sakti W.", "XI PPLG 2", "2979")

        btn1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata Siswa")
                .setItems(biodata,  DialogInterface.OnClickListener { dialog, which ->
                })
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                })
                .show()
        }

        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialog = inflater.inflate(R.layout.activity_dialog, null)
            val editText = dialog.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama")
                .setView(dialog)
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()
        }
    }
}