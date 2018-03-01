package edu.rvc.student.week8assignment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSend = findViewById<EditText>(R.id.txtSend)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendStuff", txtSend.text.toString())
            startActivity(intent)
        })

    }

}
