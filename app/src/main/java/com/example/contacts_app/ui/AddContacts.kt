package com.example.contacts_app.ui

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.core.content.FileProvider
import com.example.contacts_app.R
import com.example.contacts_app.databinding.ActivityAddContactsBinding
import com.example.contacts_app.model.ContactsDataClass
import com.example.contacts_app.view.ContactsViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationAvailability
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import java.io.File


class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    lateinit var photoFile: File
    lateinit var fusedLocationClient: FusedLocationProviderClient
    lateinit var mylocation: Location

    val cameraLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){result->
        if (result.resultCode==Activity.RESULT_OK){
            val photo = BitmapFactory.decodeFile(photoFile.absolutePath)
            binding.ivAvatar.setImageBitmap(photo)
        }
    }
    val locationRequest = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){result->
        if (checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED){

        }else{
            Toast.makeText(this, "Please grant location permission", Toast.LENGTH_LONG).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSaveContact.setOnClickListener {
            validateAddContact()
            clearErrors()
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.ivAvatar.setOnClickListener {
            capturephoto()
        }
        getLocationUpdates()
    }


    fun getLocationUpdates(){
        if (checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED)
            fusedLocationClient
                .getCurrentLocation(Priority.PRIORITY_HIGH_ACCURACY,
                    CancellationTokenSource().token
                )
                .addOnSuccessListener { location->
                mylocation= location
                Toast
                    .makeText(this,
                        "Lat: ${location.latitude}, long${location.longitude}",
                        Toast.LENGTH_LONG).show()
            } else{
                locationRequest.launch(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
    }
//    fun getLocationUpdates(){
//        if (checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED)
//            fusedLocationClient
//                .getCurrentLocation(Priority.PRIORITY_HIGH_ACCURACY,
//                    CancellationTokenSource().token
//                )
//                .addOnSuccessListener { location->
//                    mylocation= location
//                    Toast
//                        .makeText(this,
//                            "Lat: ${location.latitude}, long${location.longitude}",
//                            Toast.LENGTH_LONG).show()
//                } else{
//            locationRequest.launch(Manifest.permission.ACCESS_COARSE_LOCATION)
//        }
//    }


    private fun capturephoto(){
        val photoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        photoFile = getPhotoFile("photo_${System.currentTimeMillis()}")
        val fileUri = FileProvider.getUriForFile(this, "com.example.contacts_app.provider", photoFile)
        photoIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri)
        cameraLauncher.launch(photoIntent)
    }
    private fun getPhotoFile(filename: String): File{
        val folder = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        var tempFile = File.createTempFile(filename,".jpeg", folder)
        return  tempFile
    }

    fun validateAddContact() {
        val firstName = binding.etFirstName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val emailAddress = binding.etEmailAddress.text.toString()

        var error = false

        if (firstName.isBlank()) {
            binding.tilName.error = "Please input first name"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = "Please input phone number"
            error = true
        }
        if (emailAddress.isBlank()) {
            binding.tilEmailAddress.error = "Please input email address"
            error = true
        }
        if (!error) {
            val newContact = ContactsDataClass(0, avatar = "photoFile", contactName = firstName, phoneNumber=phoneNumber, email = emailAddress)
            contactsViewModel.saveContact(newContact)
            Toast.makeText(this, getString(R.string.contact_added_successfully), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    private fun clearErrors() {
        binding.tilName.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmailAddress.error = null
    }
}
