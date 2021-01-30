package com.example.miwok_translation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class NumbersActivity : AppCompatActivity() {
    var binding: WordListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)


        fun addwords():ArrayList<Word> {
            val word = ArrayList<Word>()
            word.add(Word("Lutti", "One"))
            word.add(Word("Ottiko", "Two"))
            word.add(Word("Tolookosu", "Three"))
            word.add(Word("four", "oyyisa"))
            word.add(Word("five", "massokka"))
            word.add(Word("six", "temmokka"))
            word.add(Word("seven", "kenekaku"))
            word.add(Word("eight", "kawinta"))
            word.add(Word("nine", "wo’e"))
            word.add(Word("ten", "na’aacha"))
            return word
        }

        val wordadd=addwords()
        val wordadapter= WordAdapter(this, wordadd,R.color.numbers)
        binding!!.listv.adapter=wordadapter
//        binding!!.recyclerv.layoutManager=LinearLayoutManager(this)
//        binding!!.recyclerv.adapter=wordadapter
    }
}
