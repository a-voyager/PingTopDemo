package top.wuhaojie.pingtopdemo;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wuhaojie on 2016/4/14 15:25.
 */
public class RouteFragment extends Fragment {

    private View mRootView;
    private RecyclerView mRcRoute;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RouteRecyclerAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.route, container, false);
        mRcRoute = (RecyclerView) mRootView.findViewById(R.id.rc_route);
        mSwipeRefreshLayout = (SwipeRefreshLayout) mRootView.findViewById(R.id.srl);
        mSwipeRefreshLayout.setColorSchemeColors(R.color.colorAccent);
        mAdapter = new RouteRecyclerAdapter(getActivity());
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.sendEmptyMessageDelayed(0, 2000);
            }
        });
//        mRcRoute.setHasFixedSize(true);
        mRcRoute.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRcRoute.setAdapter(mAdapter);
        mRcRoute.setItemAnimator(new DefaultItemAnimator());
        mRcRoute.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                if(parent.getChildPosition(view)!=0)
                    outRect.top = 20;
            }
        });
        return mRootView;
    }


    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mSwipeRefreshLayout.setRefreshing(false);
            mAdapter.add();
            Snackbar.make(getActivity().getWindow().getDecorView(), "刷新成功", Snackbar.LENGTH_SHORT).show();
        }
    };

}
