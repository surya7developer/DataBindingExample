package com.suresh.databinding.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val url = "https://source.unsplash.com/user/c_v_r/1900x800"

    private var technology = MutableLiveData<String>("Android")
    val tech : LiveData<String> get() = technology

    private var experiance = MutableLiveData<String>("5 Years Experience")
    val exp : LiveData<String> get() = experiance


    fun onUpdateData(){
        technology.value = "Flutter"
        experiance.value = "3 Years Experience"
    }

}