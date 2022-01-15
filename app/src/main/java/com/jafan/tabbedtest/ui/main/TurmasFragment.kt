package com.jafan.tabbedtest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.jafan.tabbedtest.R
import com.jafan.tabbedtest.TurmasAdapter
import com.jafan.tabbedtest.databinding.FragmentMainBinding
import com.jafan.tabbedtest.databinding.FragmentTurmasBinding
import com.jafan.tabbedtest.lista_turmas

/**
 * A placeholder fragment containing a simple view.
 */
class TurmasFragment : Fragment() {

    private var _binding: FragmentTurmasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTurmasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerTurmas = binding.turmasRecycler
        recyclerTurmas.layoutManager = LinearLayoutManager(requireContext())
        val data = lista_turmas
        val adapter = TurmasAdapter {}
        recyclerTurmas.adapter = adapter
        adapter.submitList(data)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}