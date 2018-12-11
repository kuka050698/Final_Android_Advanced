package com.example.user.final_android_advanced.Data.Room.Room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey
@Entity(tableName = "contact",foreignKeys = arrayOf(ForeignKey(entity = ContactGroupsEntity::class, parentColumns = arrayOf("id"), childColumns = arrayOf("group_id"))))
data class ContactListEntity(
        @PrimaryKey(autoGenerate = true)
        var id:Long,
        var name:String,
        var mob_number:String,
        var home_number:String,
        var work_number:String,
        var contact_group:String,
        @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
        var data: ByteArray? = null

) {

}