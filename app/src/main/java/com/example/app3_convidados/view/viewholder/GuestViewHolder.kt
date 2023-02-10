package com.example.app3_convidados.view.viewholder

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app3_convidados.R
import com.example.app3_convidados.databinding.RowGuestBinding
import com.example.app3_convidados.model.GuestModel
import com.example.app3_convidados.view.listener.OnGuestListener

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name
        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }
    }

}