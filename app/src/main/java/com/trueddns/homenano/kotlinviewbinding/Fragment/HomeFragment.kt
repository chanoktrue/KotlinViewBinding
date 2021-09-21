package com.trueddns.homenano.kotlinviewbinding.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.trueddns.homenano.kotlinviewbinding.R
import com.trueddns.homenano.kotlinviewbinding.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private  var _binding: FragmentHomeBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.messageButton.setOnClickListener {
            Toast.makeText(activity,"View Binding", Toast.LENGTH_SHORT)
                .show()
        }

        return  binding.root
    }


}