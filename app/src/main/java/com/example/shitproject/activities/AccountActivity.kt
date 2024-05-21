package com.example.shitproject.activities

import android.content.res.ColorStateList
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.example.shitproject.Application
import com.example.shitproject.R
import com.example.shitproject.Roles
import com.example.shitproject.fragments.AccountFragment
import com.example.shitproject.fragments.EventsFragment
import com.example.shitproject.fragments.MajorsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class AccountActivity
: AppCompatActivity(),
NavigationBarView.OnItemSelectedListener {

    companion object {
        private const val TAG = "AccountActivity"
    }

    private var mContainerId = 0

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        mContainerId = ViewCompat
            .generateViewId()

        val context = this
        val layout = LinearLayout(
            context
        )

        val container = FrameLayout(
            context
        )
        container.id = mContainerId

        val navigationView = BottomNavigationView(
            context
        )

        Log.d(TAG, "onCreate: ${Application.ROLE.name}")

        navigationView.inflateMenu(
            if (Application.ROLE == Roles.APPLICANT)
                R.menu.menu
             else R.menu.menu_employee
        )

        layout.orientation = LinearLayout
            .VERTICAL

        navigationView.itemIconSize = (
            Application.HEIGHT * 0.05f
        ).toInt()

        navigationView.setBackgroundColor(
            0xffeeeeee.toInt()
        )

        layout.addView(
            container,
            -1,
            (Application.HEIGHT * 0.8f).toInt()
        )

        layout.addView(
            navigationView,
            -1,
            (Application.HEIGHT * 0.1f).toInt()
        )

        navigationView.setOnItemSelectedListener(
            this
        )

        setContentView(
            layout
        )
    }

    override fun onNavigationItemSelected(
        menuItem: MenuItem
    ): Boolean {
        supportFragmentManager
            .beginTransaction()
            .replace(mContainerId, when (menuItem.itemId) {
                R.id.menu_majors -> {
                    MajorsFragment()
                }
                R.id.menu_account -> {
                    AccountFragment()
                }
                else -> {
                    EventsFragment()
                }
            }).commit()
        return true
    }

}