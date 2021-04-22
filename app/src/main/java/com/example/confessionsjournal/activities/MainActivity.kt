package com.example.confessionsjournal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.confessionsjournal.R

class MainActivity : AppCompatActivity() {

    lateinit var buttonEnter: Button
    lateinit var passwordEditText: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();
    }

    private fun init() {
        passwordEditText = findViewById(R.id.et_otp)
        buttonEnter = findViewById(R.id.enter_button)
//        buttonEnter.setOnClickListener(View.OnClickListener {
//            if(passwordEditText.text.toString()=="8918"){
                passwordEditText.text.clear()
                var intent = Intent(this, ShowAllConfessionsActivity::class.java);
                startActivity(intent);
//            }else{
//                passwordEditText.text.clear();
//                Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show()
//            }
//        })
    }
}