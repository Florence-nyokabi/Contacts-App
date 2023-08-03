package com.example.contacts_app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts_app.model.ContactsDataClass
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
        binding.btnAddContact.setOnClickListener {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)
        }
    }
    fun showContacts(){
        val contact1 = ContactsDataClass(1,"https://images.unsplash.com/photo-1607982863027-0cb6818ee8b7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact2 = ContactsDataClass(2, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact3 = ContactsDataClass(3, "https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact4 = ContactsDataClass(4, "https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact5 = ContactsDataClass(5,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact6 = ContactsDataClass(6, "https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact7 = ContactsDataClass(7,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact8 = ContactsDataClass(8, "https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact9 = ContactsDataClass(9,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact10 = ContactsDataClass(10,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact11 = ContactsDataClass(11,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact12 = ContactsDataClass(12,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact13 = ContactsDataClass(13,"https://images.unsplash.com/photo-1540174401473-df5f1c06c716?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact14 = ContactsDataClass(14,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact15 = ContactsDataClass(15,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60 ", "Flo", "07122232232", "flo@gmal.com")
        val contact16 = ContactsDataClass(16,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact17 = ContactsDataClass(17,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact18 = ContactsDataClass(18,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact19 = ContactsDataClass(19,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")
        val contact20 = ContactsDataClass(20,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBob3Rvc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Flo", "07122232232", "flo@gmal.com")


        val contactList= listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10, contact11, contact12, contact13, contact14, contact15, contact16, contact17, contact18, contact19, contact20)
        val contactsAdapt = ContactAdapter(contactList)
        binding.rvContactsList.layoutManager = LinearLayoutManager(this)
        binding.rvContactsList.adapter = contactsAdapt

    }

}