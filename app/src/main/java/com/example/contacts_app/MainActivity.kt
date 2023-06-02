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
        val contact1 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact2 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact3 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact4 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact5 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact6 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact7 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact8 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact9 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact10 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact11 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact12 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact13 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact14 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact15 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact16 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact17 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact18 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact19 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")
        val contact20 = ContactsDataClass(" ", "Flo", "07122232232", "flo@gmal.com")









        val contactList= listOf(contact1,contact2,contact3,contact4, contact5, contact6, contact7, contact8, contact9, contact10, contact11, contact12, contact13, contact14, contact15, contact16, contact17, contact18, contact19, contact20)
        val contactsAdapt = ContactAdapter(contactList)
        binding.rvContactsList.layoutManager = LinearLayoutManager(this)
        binding.rvContactsList.adapter = contactsAdapt

    }

}