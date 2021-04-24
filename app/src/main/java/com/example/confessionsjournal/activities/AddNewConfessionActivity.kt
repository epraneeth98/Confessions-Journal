package com.example.confessionsjournal.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.confessionsjournal.R
import com.google.android.material.textfield.TextInputEditText

class AddNewConfessionActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var saveButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_confession)

        init()
    }

    private fun init() {
        editText = findViewById(R.id.et_confession_text)
        saveButton = findViewById(R.id.save_new_confession_button)
        saveButton.setOnClickListener {
            val intent = Intent()
            intent.putExtra("confession_text", editText.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}