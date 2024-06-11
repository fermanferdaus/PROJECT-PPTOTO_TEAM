package com.uti.panduansuksesbertanisayuran.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uti.panduansuksesbertanisayuran.Class.ContentAdapter
import com.uti.panduansuksesbertanisayuran.R

class MenuActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var contentList: List<Pair<String, String>> // Pair of title and URL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize content list with titles and URLs
        contentList = listOf(
            "Cara Menanam Sayuran di Polybag: Panduan Praktis untuk Pemula" to "https://www.biotifor.or.id/cara-menanam-sayuran-di-polybag",
            "Cara Menanam Hidroponik untuk Pemula Mudah dan Sederhana" to "https://katadata.co.id/berita/lifestyle/618b9dcdc382c/cara-menanam-hidroponik-untuk-pemula-mudah-dan-sederhana#:~:text=Cara%20Menanam%20Hidroponik%20Sederhana%201%201.%20Mempersiapkan%20alat,7.%20Merawat%20tanaman%20...%208%208.%20Panen%20",
            "Cara Menanam Hidroponik" to "https://www.budidaya.id/hidroponik/",
            "Teknik Cara Menanam Hidroponik & Jenis Tanaman yang Cocok" to "https://tirto.id/teknik-cara-menanam-hidroponik-jenis-tanaman-yang-cocok-fXTf",
            "4 Cara Menanam Cabe Langsung di Tanah" to "https://ilmubudidaya.com/cara-menanam-cabe-langsung-di-tanah",
            "9 Cara Menanam Cabe dalam Pot" to "https://ilmubudidaya.com/cara-menanam-cabe-dalam-pot",
            "7 Cara Menanam Sayuran Organik di Rumah. Bebas Kimia, Tinggal Panen Aja" to "https://www.hipwee.com/tips/cara-menanam-sayuran/",
            "Cara Menanam Sayuran (Memanfaatkan Pekarangan Rumah)" to "https://berkebun.co.id/cara-menanam-sayuran/",
            "Cara Penanaman Sawi: Panduan Lengkap untuk Petani Sayuran" to "https://www.sawi.co.id/cara-penanaman-sawi/",
            "Cara menanam tanaman hidroponik di atas kolam lele" to "https://www.brilio.net/wow/cara-menanam-tanaman-hidroponik-di-atas-kolam-lele-2101271.html",
            "Panduan Lengkap Cara Budidaya Aquaponik untuk Pemula" to "https://trikmerawat.com/cara-budidaya-aquaponik/",
            "Budidaya Tanaman Sayuran Dalam Pot, Solusi Hijau di Rumah Minimalis " to "https://artikel.rumah123.com/budidaya-tanaman-sayuran-dalam-pot-solusi-hijau-di-rumah-minimalis-57982",
            "Hama pada Tanaman Hidroponik" to "https://lahan.co.id/hama-pada-tanaman-hidroponik/",
            "Hama dan Penyakit Tanaman – Pengertian, Jenis & Cara Ampuh Mengatasinya" to "https://rimbakita.com/hama-dan-penyakit-tanaman/",
            "10+ Hama Tanaman dan Cara Mengendalikannya" to "https://lindungihutan.com/blog/hama-tanaman-dan-cara-mengatasinya/"
        )

        // Set adapter
        val adapter = ContentAdapter(contentList) { title, url ->
            val intent = Intent(this, WebViewActivity::class.java).apply {
                putExtra("title", title)
                putExtra("url", url)
            }
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}