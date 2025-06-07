package com.example.app_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        searchView = findViewById(R.id.search_view)

        if (savedInstanceState == null) {
            replaceFragment(WeatherFragment())
            updateToolbarTitle("날씨")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_my_page -> {
                replaceFragment(MyPageFragment())
                updateToolbarTitle("마이페이지")
                true
            }
            R.id.action_weather -> {
                replaceFragment(WeatherFragment())
                updateToolbarTitle("날씨")
                true
            }
            R.id.action_notifications -> {
                replaceFragment(NotificationFragment())
                updateToolbarTitle("알림")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_content, fragment)
            .commit()
    }

    private fun updateToolbarTitle(title: String) {
        supportActionBar?.title = title
    }
}
