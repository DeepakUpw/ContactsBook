package com.example.contactsbook

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ContactModel")
data class ContactModel(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val phone : String
)
