package com.example.contactsbook

import androidx.room.Entity

@Entity(tableName = "ContactModel")
data class ContactModel(
    val id : Int,
    val name : String,
    val phone : Long
)
