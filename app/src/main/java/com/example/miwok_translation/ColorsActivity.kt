package com.example.miwok_translation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class ColorsActivity : AppCompatActivity() {
    var binding: WordListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)

        fun getColors():ArrayList<Word>{
            val colorword=ArrayList<Word>()
            colorword.add(Word("red", "weṭeṭṭi"))
            colorword.add(Word("mustard yellow", "chiwiiṭә"))
            colorword.add(Word("dusty yellow", "ṭopiisә"))
            colorword.add(Word("green", "chokokki"))
            colorword.add(Word("brown", "ṭakaakki"))
            colorword.add(Word("gray", "ṭopoppi"))
            colorword.add(Word("black", "kululli"))
            colorword.add(Word("white", "kelelli"))
            return colorword
        }
        val colorword=getColors()
        val colorwordadapter=WordAdapter(this,colorword,R.color.colors)
        binding!!.listv.adapter=colorwordadapter
    }
}