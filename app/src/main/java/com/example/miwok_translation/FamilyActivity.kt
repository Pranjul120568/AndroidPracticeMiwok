package com.example.miwok_translation

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miwok_.WordAdapter
import com.example.miwok_translation.databinding.WordListBinding

class FamilyActivity : AppCompatActivity() {
    var binding: WordListBinding?=null
     lateinit var media:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= WordListBinding.inflate(layoutInflater)
        media=MediaPlayer.create(this,R.raw.color_red)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        fun getfamilywords():ArrayList<Word>{
            val familyword= ArrayList<Word>()
            familyword.add(Word("father", "әpә",R.raw.family_father))
            familyword.add(Word("mother", "әṭa",R.raw.family_mother))
            familyword.add(Word("son", "angsi",R.raw.family_son))
            familyword.add(Word("daughter", "tune",R.raw.family_daughter))
            familyword.add(Word("older brother", "taachi",R.raw.family_older_brother))
            familyword.add(Word("younger brother", "chalitti",R.raw.family_younger_brother))
            familyword.add(Word("older sister", "teṭe",R.raw.family_older_sister))
            familyword.add(Word("younger sister", "kolliti",R.raw.family_younger_sister))
            familyword.add(Word("grandmother ", "ama",R.raw.family_grandmother))
            familyword.add(Word("grandfather", "paapa",R.raw.family_grandfather))
            return familyword
        }
        val familyworda=getfamilywords()
        val familywordadapter=WordAdapter(this,familyworda,R.color.family)
        binding!!.listv.adapter=familywordadapter
          binding!!.listv.setOnItemClickListener { parent, view, position, id ->
            val word = familyworda.get(position);
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