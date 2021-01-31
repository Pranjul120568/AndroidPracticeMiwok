package com.example.miwok_translation

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class ColorsActivity : AppCompatActivity() {
     lateinit var media:MediaPlayer
    var binding: WordListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        media=MediaPlayer.create(this,R.raw.color_red)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)

        fun getColors():ArrayList<Word>{
            val colorword=ArrayList<Word>()
            colorword.add(Word("red", "weṭeṭṭi",R.raw.color_red))
            colorword.add(Word("mustard yellow", "chiwiiṭә",R.raw.color_mustard_yellow))
            colorword.add(Word("dusty yellow", "ṭopiisә",R.raw.color_dusty_yellow))
            colorword.add(Word("green", "chokokki",R.raw.color_green))
            colorword.add(Word("brown", "ṭakaakki",R.raw.color_brown))
            colorword.add(Word("gray", "ṭopoppi",R.raw.color_gray))
            colorword.add(Word("black", "kululli",R.raw.color_black))
            colorword.add(Word("white", "kelelli",R.raw.color_white))
            return colorword
        }
        val colorword=getColors()
        val colorwordadapter=WordAdapter(this,colorword,R.color.colors)
        binding!!.listv.adapter=colorwordadapter
        binding!!.listv.setOnItemClickListener { parent, view, position, id ->
            val word = colorword.get(position);
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