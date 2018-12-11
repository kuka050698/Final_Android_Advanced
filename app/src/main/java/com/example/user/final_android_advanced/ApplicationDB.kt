package com.example.user.final_android_advanced

import android.app.Application
import android.arch.persistence.room.Room
import com.example.user.final_android_advanced.Data.Room.Room.AppDatabase

class ApplicationDB: Application(){
    lateinit var myDB:AppDatabase

    override fun onCreate() {
        super.onCreate()
        myDB = Room.databaseBuilder(applicationContext,AppDatabase::class.java,"DB")
                .fallbackToDestructiveMigration()
                .build()
    }
}