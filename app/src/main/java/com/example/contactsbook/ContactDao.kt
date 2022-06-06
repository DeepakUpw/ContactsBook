package com.example.contactsbook

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao{

    @Insert
    suspend fun insertContact(contactModel: ContactModel)

    @Delete
    suspend fun deleteContact(contactModel: ContactModel)


    @Query("SELECT * FROM ContactModel")
    fun getContacts(): LiveData<List<ContactModel>>

}