package io.inteliedoit.vclassify.ui.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.inteliedoit.vclassify.R


/**
 * A simple [Fragment] subclass.
 */
class ScheduleListFragment : Fragment() {

    fun OneFragment() {
        // Required empty public constructor
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_main_schedule_list, container, false)
    }

}// Required empty public constructor
