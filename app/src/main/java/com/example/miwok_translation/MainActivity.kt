package com.example.miwok_translation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miwok_translation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        binding!!.numbers.setOnClickListener {
            val i = Intent(this, NumbersActivity::class.java)
            startActivity(i)
        }
        binding!!.family.setOnClickListener {
            val i=Intent(this,FamilyActivity::class.java)
            startActivity(i)
        }
        binding!!.colors.setOnClickListener {
            val i=Intent(this,ColorsActivity::class.java)
            startActivity(i)
        }
        binding!!.phrases.setOnClickListener {
            val i=Intent(this,PhrasesActivity::class.java)
            startActivity(i)
        }
    }
}