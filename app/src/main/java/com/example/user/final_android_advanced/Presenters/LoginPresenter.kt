package com.example.user.final_android_advanced.Presenters

import android.text.TextUtils
import android.util.Log
import com.example.user.final_android_advanced.Data.Room.Room.UserEntity
import com.example.user.final_android_advanced.Interactors.LoginInteractorView
import com.example.user.final_android_advanced.Views.LoginView

class LoginPresenter(private val view:LoginView,private val interactor:LoginInteractorView):LoginInteractorView.onFinishedListener
{
    override fun onFailed(message: String) {
        view.onFailed(message)
    }

    override fun onSuccess() {
        view.onSuccess()
    }

    override fun showMessage(message: String) {
        view.showMessage(message)
    }

    private fun login(user_id:Long,username:String,password:String){
        if(validate(username,password)){
            interactor.login(UserEntity(user_id,username,password),this)
        }
    }
    private fun validate(username: String,password: String):Boolean{
        if(TextUtils.isEmpty(username)){
            Log.d("main","$username $password")
            view.showMessage("Enter the name")
            return false
        }
        if(TextUtils.isEmpty(password) ){
            Log.d("main","$username $password")
            view.showMessage("Enter the password")
            return false
        }
        if(!standards(password)){
            return false
        }
        return true
    }
    private fun standards(password: String):Boolean{
        var uppercase=0
        var number=0
        for(it in password){
            if(it in 'A'..'Z'){
                uppercase++
            }
            else if(it in '0'..'9'){
                number++
            }
        }
        if(password.length<8){
            Log.d("password standards","$password")
            view.showMessage("Password length must be at least 8")
            return false
        }
        if(uppercase==0){
            view.showMessage("Password should contain at least 1 uppercase letter")
            return false
        }
        if(number==0){
            view.showMessage("Password should contain at least 1 number")
            return false
        }
        return true

    }

}