package com.example.contacts_app.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
data class ContactsDataClass(
    @PrimaryKey(autoGenerate = true) @NonNull var contactId: Int,
    var avatar: String?,
    var contactName: String,
    var phoneNumber: String,
    var email: String,
)