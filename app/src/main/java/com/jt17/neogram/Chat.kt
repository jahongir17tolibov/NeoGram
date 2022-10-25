package com.jt17.neogram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Chat : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val profile_photo = findViewById<ImageView>(R.id.prof_photo)
        val nameof = findViewById<TextView>(R.id.name)
        val back = findViewById<ImageView>(R.id.back_to)
        val message = findViewById<TextView>(R.id.message_he)
        val ticking = findViewById<TextView>(R.id.clockwise)

        val top_name = intent.getStringExtra("key1")
        nameof.text = top_name

        val profile_image = intent.getIntExtra("key2", -1)
        profile_photo.setImageResource(profile_image)

        val messaging = intent.getStringExtra("key3")
        message.text = messaging

        val tocking = intent.getStringExtra("key4")
        ticking.text = tocking

        back.setOnClickListener {
            finish()
        }

    }
}