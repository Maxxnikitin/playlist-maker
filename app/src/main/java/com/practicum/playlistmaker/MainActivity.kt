package com.practicum.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchBtn = findViewById<Button>(R.id.search_btn)
        val libraryBtn = findViewById<Button>(R.id.library_btn)
        val settingsBtn = findViewById<Button>(R.id.settings_btn)

        val handleSearchBtnClick: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Клик по кнопке поиска", Toast.LENGTH_SHORT).show()
            }
        }

        searchBtn.setOnClickListener(handleSearchBtnClick)

        libraryBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Клик по медиатеке", Toast.LENGTH_SHORT).show()
        }

        settingsBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Клик по настройкам", Toast.LENGTH_LONG).show()
        }
    }
}