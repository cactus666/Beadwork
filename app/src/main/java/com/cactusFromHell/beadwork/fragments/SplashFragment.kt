package com.cactusFromHell.beadwork.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.cactusFromHell.beadwork.R
import android.widget.Button
import androidx.navigation.Navigation

class SplashFragment: Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.next).setOnClickListener(this)
        navController = Navigation.findNavController(view)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.next -> navController.navigate(R.id.action_splashFragment_to_listFragment)
        }
    }

}