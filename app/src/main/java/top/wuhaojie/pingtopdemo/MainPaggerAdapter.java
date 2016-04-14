package top.wuhaojie.pingtopdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wuhaojie on 2016/4/14 15:28.
 */
public class MainPaggerAdapter extends FragmentPagerAdapter {

    public MainPaggerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        NewFragment fragment = new NewFragment();
        switch (position) {
            case 0:
                fragment = new NewFragment();
            case 1:
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Constants.titles[position];
    }
}
