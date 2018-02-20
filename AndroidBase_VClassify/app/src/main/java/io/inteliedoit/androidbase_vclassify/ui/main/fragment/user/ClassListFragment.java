package io.inteliedoit.androidbase_vclassify.ui.main.fragment.user;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.inteliedoit.androidbase_vclassify.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassListFragment extends Fragment {


    public ClassListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_classlist, container, false);
    }

}
