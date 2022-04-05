package com.example.market88.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Prefs(activity: Activity) {
    private var sp : SharedPreferences? = null
    private val login = "login"

    init {
        sp = activity.getSharedPreferences("MYPREF", Context.MODE_PRIVATE)
    }

    fun setIslogin(value: Boolean){
       sp!!.edit().putBoolean(login, value).apply()
  }

    fun getIslogin(): Boolean{
       return sp!!.getBoolean(login, false)
    }
}
