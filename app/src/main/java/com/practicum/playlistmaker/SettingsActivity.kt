package com.practicum.playlistmaker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val shareBtn = findViewById<FrameLayout>(R.id.share_btn)
        val supportBtn = findViewById<FrameLayout>(R.id.support_btn)
        val agreementBtn = findViewById<FrameLayout>(R.id.agreement_btn)
        val backBtn = findViewById<Button>(R.id.back_btn)

        backBtn.setOnClickListener {
            finish()
        }

        shareBtn.setOnClickListener {
            val text = getString(R.string.practicum_link)
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, text)
            intent.type = "text/plain"
            startActivity(intent)
        }

        supportBtn.setOnClickListener {
            val subject = getString(R.string.email_subject)
            val message = getString(R.string.email_text)

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("maxxnikitin90@yandex.ru"))
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)

            startActivity(intent)
        }

        agreementBtn.setOnClickListener {
            val url = Uri.parse(getString(R.string.agreement_link))
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}