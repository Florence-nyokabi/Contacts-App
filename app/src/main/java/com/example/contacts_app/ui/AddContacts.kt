package com.example.contacts_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.contacts_app.R
import com.example.contacts_app.databinding.ActivityAddContactsBinding
import com.example.contacts_app.model.ContactsDataClass
import com.example.contacts_app.view.ContactsViewModel


class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSaveContact.setOnClickListener {
            validateAddContact()
            clearErrors()
        }
    }

    fun validateAddContact() {
        val firstName = binding.etFirstName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val emailAddress = binding.etEmailAddress.text.toString()

        var error = false

        if (firstName.isBlank()) {
            binding.tilName.error = "Please input first name"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = "Please input phone number"
            error = true
        }
        if (emailAddress.isBlank()) {
            binding.tilEmailAddress.error = "Please input email address"
            error = true
        }
        if (!error) {
            val newContact = ContactsDataClass(0, firstName, phoneNumber, emailAddress, "")
            contactsViewModel.saveContact(newContact)
            Toast.makeText(this, getString(R.string.contact_added_successfully), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    private fun clearErrors() {
        binding.tilName.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmailAddress.error = null
    }
}
