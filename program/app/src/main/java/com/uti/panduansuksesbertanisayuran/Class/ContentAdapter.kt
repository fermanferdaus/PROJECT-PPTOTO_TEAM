package com.uti.panduansuksesbertanisayuran.Class

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uti.panduansuksesbertanisayuran.R

class ContentAdapter {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemText: TextView = view.findViewById(R.id.item_text) // TextView untuk menampilkan judul item
    }
}