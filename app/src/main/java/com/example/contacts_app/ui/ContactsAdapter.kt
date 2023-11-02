package com.example.contacts_app.ui
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_app.R
import com.example.contacts_app.databinding.ContactListItemBinding
import com.example.contacts_app.model.ContactsDataClass
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class ContactAdapter(val contacts: List<ContactsDataClass>, var context: Context) : RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContact= contacts[position]
        val binding = holder.contactsbinding
        binding.tvContactName.text = currentContact.contactName
        binding.tvPhoneNumber.text = currentContact.phoneNumber
        binding.tvEmailAddress.text = currentContact.email
        Picasso
            .get()
//            .load(File(currentContact.avatar))
            .load(currentContact.avatar)
//            .resize(80, 80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .placeholder(R.drawable.baseline_perm_identity_24)
            .into(binding.ivAvatar)

        binding.cvContacts.setOnClickListener {
            val intent= Intent(context, ContactDetails::class.java)
            intent.putExtra("CONTACT_ID",currentContact.contactId)
            context.startActivity(intent)
        }}
    override fun getItemCount(): Int {
        return contacts.size
    }
}


class ContactsViewHolder(var contactsbinding: ContactListItemBinding): RecyclerView.ViewHolder(contactsbinding.root)