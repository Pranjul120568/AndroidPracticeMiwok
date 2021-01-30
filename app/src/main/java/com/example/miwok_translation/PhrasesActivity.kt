package com.example.miwok_translation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class PhrasesActivity : AppCompatActivity() {
    var binding:WordListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)

        fun getphraseword():ArrayList<Word>{
            val phraseword=ArrayList<Word>()
            phraseword.add(Word("Where are you going?", "minto wuksus"))
            phraseword.add(Word("What is your name?", "tinnә oyaase'nә"))
            phraseword.add(Word("My name is...", "oyaaset..."))
            phraseword.add(Word("How are you feeling?", "michәksәs?"))
            phraseword.add(Word("I’m feeling good.", "kuchi achit"))
            phraseword.add(Word("Are you coming?", "әәnәs'aa?"))
            phraseword.add(Word("Yes, I’m coming.", "hәә’ әәnәm"))
            phraseword.add(Word("I’m coming.", "әәnәm"))
            phraseword.add(Word("Let’s go.", "yoowutis"))
            phraseword.add(Word("Come here.", "әnni'nem"))
            return phraseword
        }
        val phrasewords=getphraseword()
        val phraseadapter=WordAdapter(this,phrasewords,R.color.phrases)
        binding!!.listv.adapter=phraseadapter
    }
}