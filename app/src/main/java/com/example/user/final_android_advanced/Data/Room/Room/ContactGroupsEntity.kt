package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class ContactGroupsEntity(
        @PrimaryKey(autoGenerate = true)
        var group_id:Long,
        var name:String,
        var priority:String
){}