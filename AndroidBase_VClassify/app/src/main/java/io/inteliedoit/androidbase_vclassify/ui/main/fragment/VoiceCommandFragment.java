package io.inteliedoit.androidbase_vclassify.ui.main.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.inteliedoit.androidbase_vclassify.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VoiceCommandFragment extends Fragment {


    public VoiceCommandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_voicecommand, container, false);
    }

}
