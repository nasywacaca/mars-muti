package com.example.mars_muti.Message

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.mars_muti.R
import com.google.android.material.snackbar.Snackbar

class MessageAdapter(
    context: Context,
    private val Messages: List<MessageModel>
) : ArrayAdapter<MessageModel>(context, 0, Messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_message, parent, false)

        val avatarImg = view.findViewById<ImageView>(R.id.avatarImg)
        val textSender = view.findViewById<TextView>(R.id.textSender)
        val textMessage = view.findViewById<TextView>(R.id.textMessage)

        val data = Messages[position]

        // Load gambar dari URL menggunakan Glide
        Glide.with(context)
            .load(data.avatarUrl)
            .into(avatarImg)

        textSender.text = data.senderName
        textMessage.text = data.messageText

        // OnClick pada setiap item (Poin 8 Modul)
        view.setOnClickListener {
            Snackbar.make(
                parent,
                "Pesan dari ${data.senderName}: ${data.messageText}",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        return view
    }
}