package top.wuhaojie.pingtopdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by wuhaojie on 2016/4/14 15:25.
 */
public class ZoneFragment extends Fragment {

    private View mRootView;
    private ListView mLv_zone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.zone, container, false);
        mLv_zone = (ListView) mRootView.findViewById(R.id.lv_zone);
        mLv_zone.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Constants.LIST_ZONE));
        mLv_zone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        });
        return mRootView;
    }

}
