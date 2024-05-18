package com.example.shitproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class AccountFragment
: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val context = context

        val layout = LinearLayout(
            context
        )

        val editFirstName = EditText(
            context
        )

        val editMiddleName = EditText(
            context
        )

        val editSecondName = EditText(
            context
        )

        val editPassport = EditText(
            context
        )

        layout.orientation = LinearLayout
            .VERTICAL

        editFirstName.hint = "First name"
        editMiddleName.hint = "Middle name"
        editSecondName.hint = "Second name"
        editPassport.hint = "Passport(SS SS NNNNNN)"

        layout.addView(
            editFirstName,
            -1,
            -2
        )

        layout.addView(
            editMiddleName,
            -1,
            -2
        )

        layout.addView(
            editSecondName,
            -1,
            -2
        )

        layout.addView(
            editPassport,
            -1,
            -2
        )

        return layout
    }

}