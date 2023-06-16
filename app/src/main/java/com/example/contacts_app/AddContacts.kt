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
        val name = binding.etFirstName.text.toString()
        val name2 = binding.etLastName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmailAddress.text.toString()
        clearErrors()

        var error = false
        if (name.isEmpty()) {
            binding.tilFirstName.error = "First Name is required"
            error = true
        }
        if (name2.isEmpty()) {
            binding.tilLastName.error = "Last Name is required"
            error = true
        }
        if (phoneNumber.isEmpty()) {
            binding.tilPhoneNumber.error = "Phone Number is required"
            error = true
        }
        if (name2.isEmpty()) {
            binding.tilEmailAddress.error = "Email is required"
            error = true
        }
        if (!error) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    fun clearErrors() {
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmailAddress.error = null
    }
}
