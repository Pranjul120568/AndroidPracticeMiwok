package com.example.miwok_translation

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class NumbersActivity : AppCompatActivity() {
    var binding: WordListBinding?=null
    lateinit var media: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)


        fun numberwords():ArrayList<Word> {
            val numberword = ArrayList<Word>()
            numberword.add(Word("Lutti", "One",R.raw.number_one))
            numberword.add(Word("Ottiko", "Two",R.raw.number_two))
            numberword.add(Word("Tolookosu", "Three",R.raw.number_three))
            numberword.add(Word("four", "oyyisa",R.raw.number_four))
            numberword.add(Word("five", "massokka",R.raw.number_five))
            numberword.add(Word("six", "temmokka",R.raw.number_six))
            numberword.add(Word("seven", "kenekaku",R.raw.number_seven))
            numberword.add(Word("eight", "kawinta",R.raw.number_eight))
            numberword.add(Word("nine", "wo’e",R.raw.number_nine))
            numberword.add(Word("ten", "na’aacha",R.raw.number_ten))
            return numberword
        }

        val numberworda=numberwords()
        val wordadapter= WordAdapter(this, numberworda,R.color.numbers)
        binding!!.listv.adapter=wordadapter
          binding!!.listv.setOnItemClickListener { parent, view, position, id ->
            val word = numberworda.get(position);
            media= MediaPlayer.create(this,word.mediaplay)
                media.start();
        }
    }

    override fun onStop() {
        super.onStop()
        media.stop()
        media.prepare()
        AudioManager.AUDIOFOCUS_LOSS
    }

}
