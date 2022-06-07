package com.example.contactsbook

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertContact(contactModel: ContactModel)

    @Query("SELECT * FROM ContactModel")
    fun getContacts(): LiveData<List<ContactModel>>

}