package top.wuhaojie.pingtopdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * Created by wuhaojie on 2016/4/14 15:25.
 */
public class ZoneFragment extends Fragment implements View.OnClickListener {

    private View mRootView;
    private ListView mLv_zone;
    LinearLayout mFavorite;
    LinearLayout mMessage;
    LinearLayout mOrder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.zone, container, false);
        mLv_zone = (ListView) mRootView.findViewById(R.id.lv_zone);
//        ButterKnife.bind(getActivity());
        mFavorite = (LinearLayout) mRootView.findViewById(R.id.my_favorite_zone);
        mMessage = (LinearLayout) mRootView.findViewById(R.id.my_message_zone);
        mOrder = (LinearLayout) mRootView.findViewById(R.id.my_order_zone);
        mLv_zone.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Constants.LIST_ZONE));
        mLv_zone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getActivity(), ScoreActivity.class));
                        break;
                    case 1:
                        Intent shareIntent = new Intent();
                        shareIntent.setAction(Intent.ACTION_SEND);
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Test");
                        shareIntent.setType("text/plain");
                        //设置分享列表的标题，并且每次都显示分享列表
                        startActivity(Intent.createChooser(shareIntent, "分享到"));
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        });

        mFavorite.setOnClickListener(this);
        mMessage.setOnClickListener(this);
        mOrder.setOnClickListener(this);

        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_favorite_zone:
                break;
            case R.id.my_message_zone:
                startActivity(new Intent(getActivity(), MsgActivity.class));
                break;
            case R.id.my_order_zone:
                startActivity(new Intent(getActivity(), MyOrderActivity.class));
                break;
        }
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }
}
