package com.example.user.final_android_advanced.Interactors

import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.UserEntity
import com.example.user.final_android_advanced.Data.Room.User

class LoginInteractor:LoginInteractorView {
    override fun login(user: UserEntity, listener: LoginInteractorView.onFinishedListener) {
        var userDao = ApplicationDB().myDB.userDAO().getUsersByName(user.username)
        if(user.password == userDao.password){
            listener.onSuccess()
        }
        else{
            listener.onFailed("Kuanysh")
        }

    }



}