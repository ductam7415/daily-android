package com.example.myproflie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myproflie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.name.text = "duc tam "
        binding.workplace.text = "hien chu ro"
        binding.address.text = "kim "
        binding.photos.text = "132"
        binding.follower.text = "4325"
        binding.follows.text = "2415"
        binding.executePendingBindings()

    }
}
