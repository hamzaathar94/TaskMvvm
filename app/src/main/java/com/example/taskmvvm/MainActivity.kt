package com.example.taskmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
   // private var counter=0
    private var mainViewModel:MainViewModel?=null
    private val userAdapter:UserAdapter?=null
    private  var recyclerView: RecyclerView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        mainViewModel= ViewModelProvider(this)[MainViewModel::class.java]

        recyclerView=binding?.recyclerview

        recyclerView?.apply {
            recyclerView?.layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=userAdapter
        }
        mainViewModel?.getUser()
        mainViewModel?.users?.observe(this, Observer {

            userAdapter?.data?.toString()?.let { it1 -> Log.d("ooo", it1) }
        })


//        binding?.button?.setOnClickListener {
//            binding?.textView?.text=mainViewModel?.counter.toString()
////            counter++
////            binding?.textView?.text=counter.toString()
//
//            mainViewModel?.addNumber()
//            binding?.textView?.text=mainViewModel?.counter.toString()
//        }
    }
}