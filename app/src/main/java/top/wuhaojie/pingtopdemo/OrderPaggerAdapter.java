package top.wuhaojie.pingtopdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wuhaojie on 2016/4/15 14:52.
 */
public class OrderPaggerAdapter extends FragmentPagerAdapter {

    public OrderPaggerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new AvailableOrderFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Constants.MY_ORDER_TITLES[position];
    }
}
