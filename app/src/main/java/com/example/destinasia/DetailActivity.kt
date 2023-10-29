package com.example.destinasia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detaildestination = intent.getParcelableExtra<Destination>(MainActivity.EXTRA_DESTINATION)
        if (detaildestination != null) {
            val detailfoto = findViewById<ImageView>(R.id.iv_detail)
            val detaildeskripsi = findViewById<TextView>(R.id.tv_detail_description)
            val detaildestinasi = findViewById<TextView>(R.id.tv_detail_destination)

            detailfoto.setImageResource(detaildestination.photo)
            detaildeskripsi.text = detaildestination.description
            detaildestinasi.text = detaildestination.destination
        }

    }
}