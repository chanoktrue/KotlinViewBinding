package com.trueddns.homenano.kotlinviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.trueddns.homenano.kotlinviewbinding.Fragment.HomeFragment
import com.trueddns.homenano.kotlinviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val fragmentManger: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManger.beginTransaction()
        fragmentTransaction.replace(R.id.activity_main, homeFragment).commit()



    }
}