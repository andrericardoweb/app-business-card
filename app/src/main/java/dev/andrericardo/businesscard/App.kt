package dev.andrericardo.businesscard

import android.app.Application
import dev.andrericardo.businesscard.data.AppDatabase
import dev.andrericardo.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}