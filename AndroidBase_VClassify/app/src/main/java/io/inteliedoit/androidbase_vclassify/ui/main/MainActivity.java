package io.inteliedoit.androidbase_vclassify.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


import io.inteliedoit.androidbase_vclassify.R;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.ScheduleListFragment;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.UserSettingFragment;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.VoiceCommandFragment;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar = getSupportActionBar();

        // load the store fragment by default
        toolbar.setTitle("Schedule");
        loadFragment(new ScheduleListFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_schedule:
                    toolbar.setTitle("Schedule");
                    fragment = new ScheduleListFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_command:
                    toolbar.setTitle("Command");
                    fragment = new VoiceCommandFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_setting:
                    toolbar.setTitle("Setting");
                    fragment = new UserSettingFragment();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}