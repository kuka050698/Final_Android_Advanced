package com.example.user.final_android_advanced.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.UserDao
import com.example.user.final_android_advanced.Data.Room.Room.UserEntity
import com.example.user.final_android_advanced.Data.Room.User
import com.example.user.final_android_advanced.Presenters.LoginPresenter
import com.example.user.final_android_advanced.R
import com.example.user.final_android_advanced.Views.LoginView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),LoginView {
    lateinit var userDao:UserDao
    override fun onSuccess() {
        var user:UserEntity
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("user_id", 1)
        startActivity(intent)
    }

    override fun showMessage(string: String) {

    }

    override fun onFailed(message: String) {
        val user = UserEntity(userDao.getCount() + 1,email.editText!!.text.toString(),password.editText!!.text.toString())
        userDao.insert(user)
    }

    lateinit var presenter: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        userDao = (applicationContext as ApplicationDB).myDB.userDAO()
        login.setOnClickListener{

        }
    }
}
