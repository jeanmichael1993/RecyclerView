package com.example.recyclerview

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nome: TextView?= itemView.findViewById(R.id.nome)
    val email: TextView?= itemView.findViewById(R.id.email)
    val contator: TextView?= itemView.findViewById(R.id.contador)


}
