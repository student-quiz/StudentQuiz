package com.app.studentquiz.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.studentquiz.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}