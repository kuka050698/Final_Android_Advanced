package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.user.final_android_advanced.Data.Room.User

@Database(entities = [UserEntity::class],version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun userDAO():UserDao
}