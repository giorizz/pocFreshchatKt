package br.com.pocfreshchat

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private val buttonClick = AlphaAnimation(0.8f, 1f)

    val DOMAIN = "msdk.freshchat.com"
    val APP_ID = "de2a3d6d-a64a-4acb-9c81-81f0f6ed9424"
    val APP_KEY = "e66ffe71-121a-459c-abf8-048ffbdc338f"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fat()
        feed()

        val last_message_hour = findViewById<TextView>(R.id.last_message_hour)
        val number_message = findViewById<TextView>(R.id.number_msg)
        val horaAtual = Calendar.getInstance().time
        val hr = SimpleDateFormat("HH:mm")
        val formated = hr.format(horaAtual)
        last_message_hour.text = formated

        val received_message = Random().nextInt(10)
        number_message.text = received_message.toString()

//        val config = FreshchatConfig(APP_ID, APP_KEY)
//        config.setDomain(DOMAIN)
//        Freshchat.getInstance(applicationContext).init(config)
//
//        config.setCameraCaptureEnabled(true)
//        config.setGallerySelectionEnabled(true)
//        config.setResponseExpectationEnabled(true)
//        Freshchat.getInstance(getApplicationContext()).init(config)
//
//        val freshchatUser = Freshchat.getInstance(applicationContext).user
//        freshchatUser.firstName = "John"
//        freshchatUser.lastName = "Doe"
//        freshchatUser.email = "john.doe.1982@mail.com"
//        freshchatUser.setPhone("+91", "9790987495")
//
//        val vla = Freshchat.getInstance(getApplicationContext()).setUser(freshchatUser);
//
//        println(vla)


    }

    private fun fat() {
        val btn_fat = findViewById<ConstraintLayout>(R.id.item_fat)
        btn_fat.setOnClickListener {
            val i = Intent(this, Chat::class.java)
            startActivity(i)
            btn_fat.startAnimation(buttonClick)
        }
    }

    private fun feed() {
        val btn_feed = findViewById<ConstraintLayout>(R.id.item_feed)
        btn_feed.setOnClickListener {
            val i = Intent(this, FeedbackProduct::class.java)
            startActivity(i)
            btn_feed.startAnimation(buttonClick)
        }
    }

}