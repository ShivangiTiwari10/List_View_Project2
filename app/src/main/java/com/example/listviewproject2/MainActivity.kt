package com.example.listviewproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewproject2.dataClass.User
import com.example.listviewproject2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList: ArrayList<User>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = arrayOf("Bhoomika","Divya","Disha","Malyka","Swapna")
        val lastMsg = arrayOf("Developer","Docter","Parler","Shoap","Teacher")
        val lastMsgTime = arrayOf("5:15","2:5","6","9","8")
        val phoneNo = arrayOf("25836974","159753456","846231479","987654321","9873298354")
        val imageId = intArrayOf(R.drawable.image4,R.drawable.image4,R.drawable.image4,R.drawable.image4,R.drawable.image4)


        userArrayList = ArrayList()

        for (eachIndex in name.indices){

            val user = User(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex],phoneNo[eachIndex],imageId[eachIndex])

            userArrayList.add(user)
        }
        binding.listView.isClickable = true

        binding.listView.adapter = MyAdapter(this,userArrayList)

    binding.listView.setOnItemClickListener { adapterView, view, position,id ->

        val userNme = name[position]
        val phone = phoneNo[position]
        val imgeId = imageId[position]
    }
    }

}