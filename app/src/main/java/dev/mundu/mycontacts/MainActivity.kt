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
        var contact1 = Contact("Abby", "0753489977", "mundujoana@gmail.com", "212 Kongoro Rd", " https://media.istockphoto.com/photos/carefree-africanamerican-girl-in-studio-picture-id1285993433?b=1&k=20&m=1285993433&s=170667a&w=0&h=FD2jqEYCTfdkpjrktG87B8_rlEnQTtGpT5p6ZoihOe4= ")
        var contact2 = Contact("Joana", "0729867074", "nancywuor66@gmail.com", "212 Kongo Rd", "https://media.istockphoto.com/photos/photo-of-young-curly-girl-with-glasses-picture-id1271523795?b=1&k=20&m=1271523795&s=170667a&w=0&h=8evI9MSX28O5YwKlIBtumqtPUao-XxzB12RAuG8yF1g= ")
        var contact3 = Contact("James", "0726118011", "joanatorress@gmail.com", "212 Kongo Rd", "https://media.istockphoto.com/photos/portrait-of-african-american-girl-on-blue-picture-id1349257948?b=1&k=20&m=1349257948&s=170667a&w=0&h=u6qCHJmrybLgZkK65CrmYd756_DjFVtC9TcXCz3n9eo= ")
        var contact4 = Contact("Nancy", "0772850805", "mercyyugi@gmail.com", "212 Kongo Rd", " https://media.istockphoto.com/photos/photo-of-young-curly-girl-with-glasses-picture-id1333084048?b=1&k=20&m=1333084048&s=170667a&w=0&h=1fLk7zt4K7x0c_m7YeVGjjh_lD48REGFsGjbi8exxNU=")
        var contact5 = Contact("Sarah", "0745678909", "johnDoe@gmail.com", "212 Kongo Rd", " https://media.istockphoto.com/photos/braid-style-afro-women-picture-id1336125100?b=1&k=20&m=1336125100&s=170667a&w=0&h=2Lh-ayKCoydXXqMb5ozXRx99gTDrNTKizBofPqFlbu4=")

        var contactList =
            listOf(contact1, contact2, contact3, contact4, contact5)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}