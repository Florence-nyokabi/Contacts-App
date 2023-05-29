package com.example.contacts_app
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_app.databinding.ContactListItemBinding

class ContactAdapter(val contacts: List<ContactsDataClass>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact= contacts[position]
        val binding = holder.binding
        binding.tvContactName.text = currentContact.contactName
        binding.tvPhoneNumber.text = currentContact.phoneNumber
        binding.tvEmailAddress.text = currentContact.email
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class ContactViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root)