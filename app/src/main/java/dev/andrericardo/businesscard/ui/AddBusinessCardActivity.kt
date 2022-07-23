package dev.andrericardo.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.andrericardo.businesscard.databinding.ActivityAddBusinessCardBinding


class AddBusinessCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener {

        }
    }
}