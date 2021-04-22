package com.example.confessionsjournal.activities.adapters

import android.content.Context
import android.content.res.Resources
import android.gesture.GestureStore
import android.gesture.GestureStroke
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.confessionsjournal.R


class ConfessionsListAdapter(private val context: Context, private val dataSet: ArrayList<String>):
    RecyclerView.Adapter<ConfessionsListAdapter.MyViewHolder>() {

//    lateinit var font: Typeface
//    init {
//        font = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-RobotoRegular.ttf")
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.each_confession_layout,
            parent,
            false
        )
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.textView.setTypeface(font)
        holder.textView.text = dataSet[position]
        val gradientDrawable: GradientDrawable = holder.linearLayout.background as GradientDrawable

        when(position%5) {
            0 -> gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_blue))
            1 -> gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_green))
            2 -> gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_goldenrod))
            3 -> gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_turquoise))
            4 -> gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_khaki))
            else ->{
                gradientDrawable.setStroke(20, holder.linearLayout.resources.getColor(R.color.dark_salmon))
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


    //View Holder
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val linearLayout: LinearLayout = view.findViewById(R.id.linear_layout)
        val textView: TextView = view.findViewById(R.id.tv_each_confession)
    }
}