package com.example.user.final_android_advanced.Interactors

import com.example.user.final_android_advanced.Data.Room.Room.UserEntity
import com.example.user.final_android_advanced.Data.Room.User

interface LoginInteractorView {
    interface onFinishedListener{
        fun onFailed(message: String)
        fun onSuccess()
        fun showMessage(message:String)
    }
    fun login(user: UserEntity, listener:onFinishedListener )
}
