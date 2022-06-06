package com.example.contactsbook

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ContactModel::class], version = 1)
abstract class ContactRoomDatabase : RoomDatabase(){

    abstract fun contactDao() : ContactDao

    companion object {

        private var INSTANCE : ContactRoomDatabase? = null

        fun getDatabase(context: Context) : ContactRoomDatabase{

            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context.applicationContext,ContactRoomDatabase::class.java,"")


            }

            return INSTANCE!!
        }



    }

}