package com.uti.panduansuksesbertanisayuran.Class

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uti.panduansuksesbertanisayuran.R

class ContentAdapter(
    private val contentList: List<Pair<String, String>>, // Pair of title and URL
    private val onItemClick: (String, String) -> Unit // Callback with title and URL
) : RecyclerView.Adapter<ContentAdapter.ViewHolder>(){

//  ViewHolder untuk memegang referensi tampilan setiap item dalam daftar
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemText: TextView = view.findViewById(R.id.item_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        Menginflate layout item_list_content untuk setiap item dalam RecyclerView
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_content, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Mendapatkan pasangan (title, url) dari posisi saat ini dalam daftar
        val (title, url) = contentList[position]
//        Mengatur teks TextView dengan judul dari pasangan
        holder.itemText.text = title
//        Mengatur onClickListener untuk item, memanggil callback dengan title dan URL saat diklik
        holder.itemView.setOnClickListener {
            onItemClick(title, url)
        }
    }
//    Mengembalikan jumlah item dalam daftar
    override fun getItemCount(): Int {
        return contentList.size
    }

}