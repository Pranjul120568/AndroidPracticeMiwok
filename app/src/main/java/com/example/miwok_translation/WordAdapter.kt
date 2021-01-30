package com.example.miwok_

import com.example.miwok_translation.R
import com.example.miwok_translation.Word
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RelativeLayout
import android.widget.TextView


//
class WordAdapter(context: Context, val word: ArrayList<Word>,val colourresourceId:Int) : ArrayAdapter<Word?>(context, 0, word as ArrayList<Word?>
) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        listItemView!!.findViewById<TextView>(R.id.englishtv).text = word.get(position).English
        listItemView.findViewById<TextView>(R.id.miwoktv).text = word.get(position).Miwok
        val color=colourresourceId
        listItemView.findViewById<RelativeLayout>(R.id.mkc).setBackgroundColor(color)
        return listItemView
    }
}
//Numbers-#D50000
//Phrases-#4E342E
//Colors-#C6FF00
//Family-#1A237E