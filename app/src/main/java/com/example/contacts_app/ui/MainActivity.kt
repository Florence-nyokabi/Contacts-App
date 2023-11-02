package com.example.contacts_app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app.model.ContactsDataClass
import com.example.contacts_app.databinding.ActivityMainBinding
import com.example.contacts_app.view.ContactsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()
        contactsViewModel.getContacts().observe(this, Observer { contactData -> showContacts(contactData) })

        binding.btnAddContact.setOnClickListener {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)
        }

    }
    fun showContacts(contacts: List<ContactsDataClass>){
        val contactAdapter = ContactAdapter(contacts, this)
        binding.rvContactsList.layoutManager = LinearLayoutManager(this)
        binding.rvContactsList.adapter = contactAdapter
    }

}