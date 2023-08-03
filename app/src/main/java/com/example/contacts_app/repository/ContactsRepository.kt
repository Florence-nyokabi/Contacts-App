package com.example.contacts_app.repository

import android.provider.ContactsContract.Contacts
import com.example.contacts_app.MyContactsApp
import com.example.contacts_app.database.ContactsDb
import com.example.contacts_app.model.ContactsDataClass
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDb.getDatabase(MyContactsApp.appContext)

    suspend fun saveContact(contact: ContactsDataClass){
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)
        }
    }
}