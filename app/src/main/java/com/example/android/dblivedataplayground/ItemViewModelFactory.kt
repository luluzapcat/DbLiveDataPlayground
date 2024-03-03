package com.example.android.dblivedataplayground

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ItemViewModelFactory(
//    private val dataSource: ItemDatabaseDao,
    private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ItemViewModel::class.java)) {
            return ItemViewModel(application) as T // if go to database, place "dataSource" as 1st parameter
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}