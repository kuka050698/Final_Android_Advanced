package com.example.user.final_android_advanced.Interactors

import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity

interface AddContactInteractorView {
    interface onFinishedListener{
        fun onSuccess()
        fun onFailed()
    }
    fun addContact(contact:ContactListEntity,listener:onFinishedListener)
}