package com.practicum.playlistmaker

import android.content.Intent
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

        val searchIntent = Intent(this, SearchActivity::class.java)

        val handleSearchBtnClick: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
//                Toast.makeText(this@MainActivity, "Клик по кнопке поиска", Toast.LENGTH_SHORT).show()
                startActivity(searchIntent)
            }
        }

        searchBtn.setOnClickListener(handleSearchBtnClick)

        libraryBtn.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Клик по медиатеке", Toast.LENGTH_SHORT).show()
            val libraryIntent = Intent(this, MediaLibraryActivity::class.java)
            startActivity(libraryIntent)
        }

        settingsBtn.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Клик по настройкам", Toast.LENGTH_LONG).show()
            val settingsIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingsIntent)
        }
    }
}