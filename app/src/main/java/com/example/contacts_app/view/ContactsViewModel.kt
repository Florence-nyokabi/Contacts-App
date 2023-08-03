package com.example.contacts_app.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contacts_app.model.ContactsDataClass
import com.example.contacts_app.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel: ViewModel() {
    val contactsRepo = ContactsRepository()

    fun saveContact(contact: ContactsDataClass){
        viewModelScope.launch {
            contactsRepo.saveContact(contact)
        }
    }
}