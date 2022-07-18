package dev.mundu.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.mundu.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList: List<Contact>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
       var contactsViewHolder = ContactsViewHolder(binding)
            return  contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
    var currentContact =contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get()

            .load(currentContact.image)
            .resize(250,250)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_outline_24)
            .error(R.drawable.ic_baseline_error_24)
            .into(holder.binding.ivUser)

    val context = holder.itemView.context
    holder.binding.ivUser.setOnClickListener {
        Toast.makeText(context, "You have clicked on ${currentContact}image", Toast.LENGTH_SHORT).show()
    }
        holder.binding.cvContacts.setOnClickListener {
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME", currentContact.name)
            intent.putExtra("EMAIL", currentContact.email)
            intent.putExtra("PHONE_NUMBER",currentContact.phoneNumber)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }
     }

    override fun getItemCount(): Int {
       return contactList.size
    }
}

class  ContactsViewHolder(var binding: ContactListItemBinding):
        RecyclerView.ViewHolder(binding.root){
}