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
        var contact1 = Contact(
            "Abby",
            "0753489977",
            "mundujoana@gmail.com",
            "212 Kongoro Rd",
            "https://images.unsplash.com/photo-1614251056798-0a63eda2bb25?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        var contact2 = Contact(
            "Joana",
            "0729867074",
            "nancywuor66@gmail.com",
            "212 Kongo Rd",
            "https://images.pexels.com/photos/1006195/pexels-photo-1006195.png?auto=compress&cs=tinysrgb&w=400"
        )
        var contact3 = Contact(
            "James",
            "0726118011",
            "joanatorress@gmail.com",
            "212 Kongo Rd",
            "https://images.pexels.com/photos/1126727/pexels-photo-1126727.jpeg?auto=compress&cs=tinysrgb&w=400"
        )
        var contact4 = Contact(
            "Nancy",
            "0772850805",
            "mercyyugi@gmail.com",
            "212 Kongo Rd",
            "https://images.pexels.com/photos/1188079/pexels-photo-1188079.jpeg?auto=compress&cs=tinysrgb&w=400"
        )
        var contact5 = Contact(
            "Sarah",
            "0745678909",
            "johnDoe@gmail.com",
            "212 Kongo Rd",
            "https://images.pexels.com/photos/953266/pexels-photo-953266.jpeg?auto=compress&cs=tinysrgb&w=400"
        )

        var contactList =
            listOf(contact1, contact2, contact3, contact4, contact5)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter

    }
}