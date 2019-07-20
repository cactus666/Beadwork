package com.cactusFromHell.beadwork.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.cactusFromHell.beadwork.R

class ContentFragment: Fragment(), View.OnClickListener {

    private lateinit var webView: WebView
    private lateinit var toolbar_title: TextView
    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_content, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webView = view.findViewById(R.id.webView)
        toolbar_title = view.findViewById(R.id.toolbar_title)
        view.findViewById<ImageView>(R.id.arrow_back).setOnClickListener(this)
        navController = Navigation.findNavController(view)
        loadContent()
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.arrow_back -> navController.popBackStack()
            R.id.share -> share()
        }
    }

    private fun loadContent(){
        toolbar_title.text = arguments!!.getString("name")
        webView.loadUrl(arguments!!.getString("url"))

    }

    private fun share() {
        // share in vk
    }

}
