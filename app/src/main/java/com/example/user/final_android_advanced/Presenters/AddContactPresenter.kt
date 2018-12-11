package com.example.user.final_android_advanced.Presenters

import android.view.View
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity
import com.example.user.final_android_advanced.Interactors.AddContactInteractorView
import com.example.user.final_android_advanced.Views.AddContactView

class AddContactPresenter(private val view: AddContactView, private val interactor:AddContactInteractorView):AddContactInteractorView.onFinishedListener{
    override fun onSuccess() {
        view.onSuccess()
    }

    override fun onFailed() {
        view.onFailed()
    }
    fun add(contact:ContactListEntity){
        interactor.addContact(contact,this)
    }
}