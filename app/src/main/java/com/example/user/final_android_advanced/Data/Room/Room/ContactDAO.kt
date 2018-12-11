package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface ContactDAO{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addContact(contact:ContactListEntity)

    @Query("SELECT *from contact")
    fun getContact():List<ContactListEntity>
}