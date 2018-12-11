package com.example.user.final_android_advanced.Views

interface LoginView {
    fun onSuccess()
    fun showMessage(string:String)
    fun onFailed(message:String)
}