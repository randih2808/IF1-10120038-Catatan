package com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.R
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.onboarding.screens.FirstScreen
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.onboarding.screens.SecondScreen
import com.Tugas_UTS_Genap_2023_AKB.IF1_10120038_Catatan_Harian.onboarding.screens.ThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

//NIM: 10120038
//Nama: Randi Hardiansyah
//Kelas: IF-1


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewPager.adapter = adapter

        return view
    }

}