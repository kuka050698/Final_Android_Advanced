package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
        @PrimaryKey(autoGenerate = true)
        var user_id:Long,
        var username:String,
        var password:String
) {
    override fun toString(): String {
        return "User(id=$user_id, name='$username', password='$password')"
    }

}