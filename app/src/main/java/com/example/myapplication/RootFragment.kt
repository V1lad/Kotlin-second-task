package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class RootFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_root, container, false)
        val loginEdit = view.findViewById<EditText>(R.id.editTextLogin)
        val passwordEdit = view.findViewById<EditText>(R.id.editTextPassword)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val login = loginEdit.text.toString()
            val password = passwordEdit.text.toString()

            if ((password == "12345678")and(login == "petrov")){
                val bundle = Bundle()
                bundle.putString("login",login)
                bundle.putString("password",password)
                findNavController().navigate(R.id.action_rootFragment_to_resultFragment, bundle)
            }

        }
        return view
    }


}