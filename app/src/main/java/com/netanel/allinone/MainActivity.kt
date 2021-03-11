package com.netanel.allinone

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.netanel.allinone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val activityMainBindingRoot = activityMainBinding.root

        setContentView(activityMainBindingRoot)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home,
                R.id.nav_live_games,
                R.id.nav_sport5,
                R.id.nav_one,
                R.id.nav_winner,
                R.id.nav_pais,
                R.id.nav_maariv,
                R.id.nav_mako,
                R.id.nav_ynet,
                R.id.nav_walla,
                R.id.nav_youtube,
                R.id.nav_channel_eleven,
                R.id.nav_twenty_news,
                R.id.nav_channel_twelve,
                R.id.nav_channel_thirteen,
                R.id.nav_twenty
            ), activityMainBinding.drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        activityMainBinding.navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}