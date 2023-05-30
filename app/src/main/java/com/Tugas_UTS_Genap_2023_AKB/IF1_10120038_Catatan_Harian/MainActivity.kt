package com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.R

//NIM: 10120038
//Nama: Randi Hardiansyah
//Kelas: IF-1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}