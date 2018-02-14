package io.inteliedoit.vclassify.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.inteliedoit.vclassify.R
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter
import android.view.View


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v7.widget.Toolbar;

import java.util.ArrayList;


class MainActivity : AppCompatActivity() {


    private var toolbar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById<View>(R.id.viewpager) as ViewPager?
        setupViewPager(viewPager)

        tabLayout = findViewById<View>(R.id.tabs) as TabLayout?
        tabLayout!!.setupWithViewPager(viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager?) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ScheduleListFragment(), "Schedule")
        adapter.addFragment(VoiceCommandFragment(), "Profile")
        viewPager!!.adapter = adapter
    }

    internal inner class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

        override fun getItem(position: Int): Fragment {
            return mFragmentList.get(position)
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList.get(position)
        }
    }
}