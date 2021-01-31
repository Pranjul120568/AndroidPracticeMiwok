package com.example.miwok_translation

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class PhrasesActivity : AppCompatActivity() {
    var binding:WordListBinding?=null
    lateinit var media:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)

        fun getphraseword():ArrayList<Word>{
            val phraseword=ArrayList<Word>()
            phraseword.add(Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going))
            phraseword.add(Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name))
            phraseword.add(Word("My name is...", "oyaaset...",R.raw.phrase_my_name_is))
            phraseword.add(Word("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling))
            phraseword.add(Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good))
            phraseword.add(Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming))
            phraseword.add(Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming))
            phraseword.add(Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming))
            phraseword.add(Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go))
            phraseword.add(Word("Come here.", "әnni'nem",R.raw.phrase_come_here))
            return phraseword
        }
        val phrasewords=getphraseword()
        val phraseadapter=WordAdapter(this,phrasewords,R.color.phrases)
        binding!!.listv.adapter=phraseadapter
        binding!!.listv.setOnItemClickListener { parent, view, position, id ->
            val word=phrasewords.get(position)
            media=MediaPlayer.create(this,word.mediaplay)
            media.start()

        }
    }
    override fun onStop() {
        super.onStop()
        media.stop()
        media.prepare()
        AudioManager.AUDIOFOCUS_LOSS
    }
}