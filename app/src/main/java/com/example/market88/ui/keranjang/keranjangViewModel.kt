package com.example.market88.ui.keranjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class keranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selamat datang dikeranjang"
    }
    val text: LiveData<String> = _text
}