package com.example.contacts_app.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.contacts_app.model.ContactsDataClass

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: ContactsDataClass)

    @Query("SELECT * FROM Contacts ORDER BY contactName")
    fun getAllContacts(): LiveData<List<ContactsDataClass>>

    @Query("SELECT * FROM Contacts WHERE contactId = :contactId")
    fun getContactById(contactId: Int): LiveData<ContactsDataClass>

}


