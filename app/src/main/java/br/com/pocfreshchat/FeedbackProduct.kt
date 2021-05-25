package br.com.pocfreshchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class FeedbackProduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_product)


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