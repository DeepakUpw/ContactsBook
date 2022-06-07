package com.example.contactsbook

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : ViewModel() {

    private val contactDao = ContactRoomDatabase.getDatabase(application).contactDao()

    var userName = MutableLiveData<String>()
    var userPhone = MutableLiveData<String>()

    val contactList = contactDao.getContacts()

    //on addContact btn clicked
    fun addContact(){
        val contactModel = ContactModel(0,userName.value.toString(),userPhone.value.toString())
        GlobalScope.launch(Dispatchers.IO){
            contactDao.insertContact(contactModel)
        }
    }


}