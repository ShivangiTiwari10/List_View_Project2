package com.example.listviewproject2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewproject2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)

        binding.name.text = intent.getStringExtra("name")
        binding.phone.text = intent.getStringExtra("Phone")
        binding.profileImage.setImageResource(intent.getIntExtra("Image",R.drawable.floura))
        setContentView(binding.root)

    }
}