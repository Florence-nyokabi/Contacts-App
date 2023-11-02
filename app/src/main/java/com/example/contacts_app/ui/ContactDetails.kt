package com.example.contacts_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.contacts_app.databinding.ActivityContactDetailsBinding
import com.example.contacts_app.model.ContactsDataClass
import com.example.contacts_app.view.ContactsViewModel
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactDetails : AppCompatActivity() {
    var contactId = 0
    private lateinit var viewModel: ContactsViewModel

    lateinit var binding: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ContactsViewModel()
        val contactId = intent.getIntExtra("CONTACT_ID", 0)
        viewModel.getContactById(contactId).observe(this, Observer { contact ->
            if (contact != null) {
                displayContactDetails(contact)
            } else {
                Toast.makeText(this, "Contact not found", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun displayContactDetails(contact:ContactsDataClass) {
        binding.tvName.text = contact.contactName
        binding.tvPhoneNumber.text = contact.phoneNumber
        binding.tvEmail.text = contact.email
        if (!contact.avatar.isNullOrEmpty()) {
            Picasso
                .get()
                .load(contact.avatar)
                .resize(80, 80)
                .centerCrop()
                .transform(CropCircleTransformation())
                .into(binding.ivAvatar)
        }
    }}
