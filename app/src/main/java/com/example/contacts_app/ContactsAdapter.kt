package com.example.contacts_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val contacts: List<String>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageView = itemView.findViewById<ImageView>(R.id.imgAvator)
    val textViewName = itemView.findViewById<TextView>(R.id.tvContactName)
    val textViewPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    val textViewEmailAddress = itemView.findViewById<TextView>(R.id.tvEmailAddress)

    fun bind(contact: Contact) {


        // Set the contact name
        textViewName.text = contact.name

        // Set the contact phone number
        textViewPhoneNumber.text = contact.phoneNumber

        // Set the contact email address
        textViewEmailAddress.text = contact.emailAddress
    }
}