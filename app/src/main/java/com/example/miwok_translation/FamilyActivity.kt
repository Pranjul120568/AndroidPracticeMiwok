package com.example.miwok_translation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class FamilyActivity : AppCompatActivity() {
    var binding: WordListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        fun getfamilywords():ArrayList<Word>{
            val familyword= ArrayList<Word>()
            familyword.add(Word("father", "әpә"))
            familyword.add(Word("mother", "әṭa"))
            familyword.add(Word("son", "angsi"))
            familyword.add(Word("daughter", "tune"))
            familyword.add(Word("older brother", "taachi"))
            familyword.add(Word("younger brother", "chalitti"))
            familyword.add(Word("older sister", "teṭe"))
            familyword.add(Word("younger sister", "kolliti"))
            familyword.add(Word("grandmother ", "ama"))
            familyword.add(Word("grandfather", "paapa"))
            return familyword
        }
        val familyworda=getfamilywords()
        val familywordadapter=WordAdapter(this,familyworda,R.color.family)
        binding!!.listv.adapter=familywordadapter

    }
}