package edu.rvc.student.week8assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtShow = findViewById<TextView>(R.id.txtShow)

        var strShow: String = intent.getStringExtra("SendStuff")
        txtShow.setText("Your Email Address is: $strShow")
    }
}
