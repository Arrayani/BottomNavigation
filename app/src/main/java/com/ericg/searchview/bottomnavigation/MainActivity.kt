package com.ericg.searchview.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import com.gamingcode.FirstFragment
import com.gamingcode.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomNav = findViewById<View>(R.id.bottomNavigationView)
        bottomNav.background =null

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
//kalo berhubungan dengan fragment, akan memanggil class ini
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, homeFragment)
            commit()
        }
        val homeButton = findViewById<View>(R.id.miHome)
        homeButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, homeFragment)
                addToBackStack(null)
                commit()
            }

            val profileButton = findViewById<View>(R.id.miProfile)
            profileButton.setOnClickListener{

//                supportFragmentManager.beginTransaction().apply {
//                        replace(R.id.flFragment, profileFragment)
//                        addToBackStack(null)
//                        commit()

//                supportFragmentManager.beginTransaction().
//                setCustomAnimations(
//                    enter = R.anim.slide_in,
//                    exit= R.anim.fade_out,
//                    popEnter = R.anim.fade_in,
//                    popExit =  R.anim.slide_out
//                )
//                replace(R.id.flFragment, profileFragment)
//                addToBackStack(null)
//                commit()
//                }
                val transactionx = supportFragmentManager.beginTransaction()
                transactionx.setCustomAnimations(0,R.anim.fade_in
                ).add(profileFragment,)

//                (enter = R.anim.slide_in,exit= R.anim.fade_out,
//                    popEnter = R.anim.fade_in,
//                    popExit =  R.anim.slide_out)





    }}
}


}