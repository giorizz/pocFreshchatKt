package br.com.pocfreshchat

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class Chat : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val btn_close = findViewById<ImageView>(R.id.ivCloseChat)
        val btn_send_message = findViewById<ImageView>(R.id.ivSendNewMessage)
        val input_send_message = findViewById<EditText>(R.id.etNewMessage)

        btn_close.setOnClickListener {
            finish()
        }

        btn_send_message.setOnClickListener {
            if (input_send_message.text.isNullOrEmpty()) {
                Toast.makeText(this, "Campo vazio...", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, input_send_message.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}