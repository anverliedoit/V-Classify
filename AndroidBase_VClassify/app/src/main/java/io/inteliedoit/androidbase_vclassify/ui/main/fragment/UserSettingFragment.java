package io.inteliedoit.androidbase_vclassify.ui.main.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.inteliedoit.androidbase_vclassify.R;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.user.ClassListFragment;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.user.ProfileFragment;
import io.inteliedoit.androidbase_vclassify.ui.main.fragment.user.SubjectListFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserSettingFragment extends Fragment {


    private TabLayout mTablayout;
    private ViewPager mViewpager;

    public UserSettingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_usersetting, container, false);

        mViewpager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(mViewpager);

        mTablayout = (TabLayout) view.findViewById(R.id.tabs);
        mTablayout.setupWithViewPager(mViewpager);

        return view;
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager ());
        adapter.addFragment(new SubjectListFragment(), "Subject");
        adapter.addFragment(new ClassListFragment(), "Class");
        adapter.addFragment(new ProfileFragment(), "Profile");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}