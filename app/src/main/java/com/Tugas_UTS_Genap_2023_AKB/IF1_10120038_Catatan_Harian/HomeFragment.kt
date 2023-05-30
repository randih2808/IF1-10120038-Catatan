package com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.R

//NIM: 10120038
//Nama: Randi Hardiansyah
//Kelas: IF-1

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_splash, container, false)
    }

}