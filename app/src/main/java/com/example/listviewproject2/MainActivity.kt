package com.example.listviewproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewproject2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList: ArrayList<User>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = arrayOf("Bhoomika", "Divya", "Disha", "Malyka","Swapna")
        var lastMsg = arrayOf("Developer", "Docter", "Parler", "Shoap","Teacher")
        var lastMsgTime = arrayOf("5:15" ,"2:5", "6", "9","8")
        var phoneNo = arrayOf("25836974","159753456","846231479","987654321","9873298354")
        var imageId = intArrayOf(R.drawable.image4,R.drawable.image4,R.drawable.image4,R.drawable.image4)

    }
}