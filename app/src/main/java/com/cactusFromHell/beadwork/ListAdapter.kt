package com.cactusFromHell.beadwork

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(context: Context, private val mData: Array<Array<String>>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater
    private val context: Context
    private var navController: NavController? = null

    init {
        this.mInflater = LayoutInflater.from(context)
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.item_for_list, parent, false)
        navController = Navigation.findNavController(parent)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name_category.text = mData[position][0]
        holder.url = mData[position][1]
    }

    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val name_category: TextView = itemView.findViewById(R.id.name_category)
        lateinit var url: String

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            val bundle = Bundle()
            bundle.putString("url", url)
            bundle.putString("name", name_category.text.toString())
            navController!!.navigate(R.id.action_listFragment_to_contentFragment, bundle)
        }
    }
}

