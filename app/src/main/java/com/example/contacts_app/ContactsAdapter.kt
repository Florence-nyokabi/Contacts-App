package com.example.contacts_app
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_app.databinding.ContactListItemBinding

class ContactAdapter(val contacts: List<ContactsDataClass>) : RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContact= contacts[position]
        val binding = holder.contactsbinding
        binding.tvContactName.text = currentContact.contactName
        binding.tvPhoneNumber.text = currentContact.phoneNumber
        binding.tvEmailAddress.text = currentContact.email
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class ContactsViewHolder(var contactsbinding: ContactListItemBinding): RecyclerView.ViewHolder(contactsbinding.root)