package com.example.fr.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fr.coderswag.Adapters.CategoryAdapter
import com.example.fr.coderswag.R
import com.example.fr.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
