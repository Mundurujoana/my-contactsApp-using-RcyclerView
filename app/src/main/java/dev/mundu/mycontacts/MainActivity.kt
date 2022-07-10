package dev.mundu.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mundu.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayContacts()
    }

    fun displayContacts() {
        var contact1 = Contact("Abby", "0753489977", "mundujoana@gmail.com", "212 Kongoro Rd", "")
        var contact2 = Contact("Joana", "0729867074", "nancywuor66@gmail.com", "212 Kongo Rd", "")
        var contact3 = Contact("James", "0726118011", "joanatorress@gmail.com", "212 Kongo Rd", "")
        var contact4 = Contact("Nancy", "0772850805", "mercyyugi@gmail.com", "212 Kongo Rd", "")
        var contact5 = Contact("Sarah", "0745678909", "johnDoe@gmail.com", "212 Kongo Rd", "")

        var contactList =
            listOf(contact1, contact2, contact3, contact4, contact5)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}