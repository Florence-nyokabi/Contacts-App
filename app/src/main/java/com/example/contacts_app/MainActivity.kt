package com.example.contacts_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        showContacts()
    }
    fun showContacts(){
        val contact1 = ContactsDataClass("https://images.unsplash.com/photo-1607982863027-0cb6818ee8b7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact2 = ContactsDataClass("https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact3 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact4 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact5 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact6 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact7 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact8 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact9 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact10 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact11 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact12 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact13 = ContactsDataClass("https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact14 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact15 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact16 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact17 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact18 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact19 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact20 = ContactsDataClass("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")


        val contactList= listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10, contact11, contact12, contact13, contact14, contact15, contact16, contact17, contact18, contact19, contact20)
        val contactsAdapt = ContactAdapter(contactList)
        binding.rvContactsList.layoutManager = LinearLayoutManager(this)
        binding.rvContactsList.adapter = contactsAdapt

    }

}