package com.uti.panduansuksesbertanisayuran.Activity

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContentAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}