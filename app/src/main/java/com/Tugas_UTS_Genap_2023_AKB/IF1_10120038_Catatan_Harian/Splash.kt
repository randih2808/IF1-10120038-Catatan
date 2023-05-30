package com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.R


//NIM: 10120038
//Nama: Randi Hardiansyah
//Kelas: IF-1


class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.btnNavigationView)
        val navController = findNavController(R.id.navbarFragment)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.nbHomee, R.id.nbCatatansaya, R.id.nbProfilesaya))
        setupActionBarWithNavController(navController, appBarConfiguration)



        bottomNavigationView.setupWithNavController(navController)

    }
}