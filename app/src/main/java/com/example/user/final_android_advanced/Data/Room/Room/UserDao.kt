package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDao {
    @Insert
    fun insert(user:UserEntity)

    @Query("SELECT *from user")
    fun getAllUsers():List<UserEntity>

    @Query("SELECT * FROM user WHERE username = :name")
    fun getUsersByName(name: String): UserEntity

    @Query("SELECT COUNT(id) FROM user")
    fun getCount(): Long

}