package com.infinitystock.techcypro.utils;

import static com.infinitystock.techcypro.utils.Constant.PAGER_NUMBER_DEFAULT;
import static com.infinitystock.techcypro.utils.Constant.PAGER_NUMBER_NO_PAGE;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.infinitystock.techcypro.fragments.FragmentCategory;
import com.infinitystock.techcypro.fragments.FragmentFavorite;
import com.infinitystock.techcypro.fragments.FragmentPage;
import com.infinitystock.techcypro.fragments.FragmentPost;

@SuppressWarnings("ALL")
public class NavigationAdapter {

    public static class BottomNavigationAdapterDefault extends FragmentPagerAdapter {

        public BottomNavigationAdapterDefault(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentPost();
                case 1:
                    return new FragmentCategory();
                case 2:
                    return new FragmentPage();
                case 3:
                    return new FragmentFavorite();
            }
            return null;
        }

        @Override
        public int getCount() {
            return PAGER_NUMBER_DEFAULT;
        }

    }

    public static class BottomNavigationAdapterNoPage extends FragmentPagerAdapter {

        public BottomNavigationAdapterNoPage(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentPost();
                case 1:
                    return new FragmentCategory();
                case 2:
                    return new FragmentFavorite();
            }
            return null;
        }

        @Override
        public int getCount() {
            return PAGER_NUMBER_NO_PAGE;
        }

    }

}
