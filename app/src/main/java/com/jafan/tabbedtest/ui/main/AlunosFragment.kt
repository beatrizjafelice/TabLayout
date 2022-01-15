package com.jafan.tabbedtest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jafan.tabbedtest.AlunoAdapter
import com.jafan.tabbedtest.databinding.FragmentAlunosBinding
import com.jafan.tabbedtest.databinding.FragmentTurmasBinding
import com.jafan.tabbedtest.lista_alunos
import com.jafan.tabbedtest.lista_turmas

class AlunosFragment: Fragment() {
    
    private var _binding: FragmentAlunosBinding? = null

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

        _binding = FragmentAlunosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerAlunos = binding.alunosRecycler
        val adapter = AlunoAdapter {}
        val data = lista_alunos
        recyclerAlunos.adapter = adapter
        adapter.submitList(data)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}