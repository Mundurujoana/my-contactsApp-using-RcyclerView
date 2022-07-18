package dev.mundu.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.mundu.mycontacts.databinding.ActivityMainBinding
import dev.mundu.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getExtras()
    }
        fun getExtras() {
        val extras=intent.extras
        val image = extras?.getString("IMAGE","")
        Picasso.get()
            .load(image)
            .resize(250,250)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_outline_24)
            .error(R.drawable.ic_baseline_error_24)
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.ivPerson)
        val name=extras?.getString("NAME","")
        binding.tvNames.text = name
        val  email=extras?.getString("EMAIL","")
        binding.tvEmaill.text=email


        Toast.makeText(this,"$name:$email",Toast.LENGTH_LONG).show()

    }
}