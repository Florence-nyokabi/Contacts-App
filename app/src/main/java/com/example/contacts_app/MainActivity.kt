package com.example.contacts_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        showContacts()
    }
    fun showContacts(){
        val contact1 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com",)
        val contact2 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com",)
        val contact3 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com",)
        val contact4 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com",)

        val contactList= listOf(contact1,contact2,contact3,contact4)
        val contactsAdapt = ContactAdapter(contactList)
        binding.rvContactsList.layoutManager = LinearLayoutManager(this)
        binding.rvContactsList.adapter = contactsAdapt

    }

}