package com.trueddns.homenano.kotlinviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.trueddns.homenano.kotlinviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.messageButton.setOnClickListener {
            Toast.makeText(this,"View Binding", Toast.LENGTH_SHORT)
                .show()
        }
    }
}