package com.cactusFromHell.beadwork.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cactusFromHell.beadwork.ListAdapter
import com.cactusFromHell.beadwork.R

class ListFragment: Fragment() {

    private lateinit var data: Array<Array<String>>
    private lateinit var list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data =  arrayOf(
            arrayOf(context!!.getString(R.string.item_1), context!!.getString(R.string.item_1_url)),
            arrayOf(context!!.getString(R.string.item_2), context!!.getString(R.string.item_2_url)),
            arrayOf(context!!.getString(R.string.item_3), context!!.getString(R.string.item_3_url)),
            arrayOf(context!!.getString(R.string.item_4), context!!.getString(R.string.item_4_url)),
            arrayOf(context!!.getString(R.string.item_5), context!!.getString(R.string.item_5_url)),
            arrayOf(context!!.getString(R.string.item_6), context!!.getString(R.string.item_6_url))
        )
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = view.findViewById(R.id.list)
        list.setHasFixedSize(true);
        list.setLayoutManager(LinearLayoutManager(activity!!.applicationContext));
        list.setAdapter(ListAdapter(activity!!.applicationContext, data));
    }

}
