package com.example.taskmvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
  private var _user= MutableLiveData<List<User>>()
  val users: LiveData<List<User>> = _user

  fun getUser(){
    val list = mutableListOf<User>()
    list.add(
      User(
        "Hamza",
        1,
        R.drawable.profile
      )
    )
    list.add(User(
      "Asad",
      2,
      R.drawable.profile
    ))
    list.add(User(
      "Usama",
      3,
      R.drawable.profile
    ))
    list.add(User(
      "Abubakar",
      4,
      R.drawable.profile
    ))
    list.add(User(
      "Zubair",
      5,
      R.drawable.profile
    ))

    _user.value=list

    //Log.d("ooo",list.toString())
  }

}