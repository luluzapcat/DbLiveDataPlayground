package com.example.android.dblivedataplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ItemViewModel
    lateinit var adapter: ItemAdapter

    val item1 = Item("item1")
    val item2 = Item("item2")
    val item3 = Item("item3")

    var data: ArrayList<Item> = arrayListOf(item1, item2, item3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
        setupRecyclerView()
    }

    private fun setupViewModel() {
        val application = requireNotNull(this).application
//        val dataSourceFiles = ItemDb.getInstance(application).filesDatabaseDao
        val viewModelFactory = ItemViewModelFactory(application)
        viewModel =
            ViewModelProvider(
                this, viewModelFactory
            ).get(ItemViewModel::class.java)
    }

    private fun setupRecyclerView() {
        adapter = ItemAdapter()
        adapter.data = data
    }
}