package com.example.shitproject.activities

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.shitproject.Application
import com.example.shitproject.Roles

class MainActivity
: AppCompatActivity() {

    private lateinit var mEditTextEmail: EditText
    private lateinit var mEditTextPassword: EditText

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val context = this

        val layout = LinearLayout(
            context
        )

        mEditTextEmail = EditText(
            context
        )

        mEditTextPassword = EditText(
            context
        )

        val btnSignIn = Button(
            context
        )

        layout.orientation = LinearLayout
            .VERTICAL

        layout.gravity = Gravity
            .CENTER_VERTICAL

        mEditTextEmail.hint = "Email"
        mEditTextPassword.hint = "Password"
        btnSignIn.text = "Sign in"

        btnSignIn.setOnClickListener(
            this::onClickSignIn
        )

        layout.addView(
            mEditTextEmail,
            -1,
            -2
        )

        layout.addView(
            mEditTextPassword,
            -1,
            -2
        )

        layout.addView(
            btnSignIn,
            -1,
            -2
        )

        setContentView(
            layout
        )
    }


    private fun onClickSignIn(
        view: View
    ) {
        val context = this
        val email = mEditTextEmail.text
        val password = mEditTextPassword.text

        if (email.isBlank()) {
            Application.toast(
                "Email is blanked!",
                context
            )
            return
        }

        if (password.isBlank()) {
            Application.toast(
                "Password is blanked!",
                context
            )
            return
        }

        val intent = Intent(
            context,
            AccountActivity::class.java
        )

        intent.setFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK or
            Intent.FLAG_ACTIVITY_CLEAR_TOP
        )

        if (email.equals("admin")
            && password.equals("admin")
        ) {
            Application.ROLE = Roles.EMPLOYEE
        }

        startActivity(
            intent
        )
    }

}