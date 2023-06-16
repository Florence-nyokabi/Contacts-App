package com.example.contacts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contacts_app.databinding.ActivityAddContactsBinding


class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding

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
        val lastName = binding.etLastName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val emailAddress = binding.etEmailAddress.text.toString()

        var error = false

        if (firstName.isEmpty()) {
            binding.tilFirstName.error = "Please input first name"
            error = true
        }
        if (lastName.isEmpty()) {
            binding.tilLastName.error = "Please input last name"
            error = true
        }
        if (phoneNumber.isEmpty()) {
            binding.tilPhoneNumber.error = "Please input phone number"
            error = true
        }
        if (emailAddress.isEmpty()) {
            binding.tilEmailAddress.error = "Please input email address"
            error = true
        }
        if (!error) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    private fun clearErrors() {
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmailAddress.error = null
    }
}
