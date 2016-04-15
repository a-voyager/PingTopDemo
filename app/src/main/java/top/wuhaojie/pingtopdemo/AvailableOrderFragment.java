package top.wuhaojie.pingtopdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaojie on 2016/4/15 15:02.
 */
public class AvailableOrderFragment extends Fragment {

    private View mView;
    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.my_available_order, container, false);
        mListView = (ListView) mView.findViewById(R.id.lv_my_order);
        MyAdapter myAdapter = new MyAdapter();
        myAdapter.add();
        myAdapter.add();
        mListView.setAdapter(myAdapter);
        return mView;

    }


    private class MyAdapter extends BaseAdapter {


        public List<OrderItem> mOrderItems = new ArrayList<>();

        public class OrderItem {
            public String addr;
        }

        public void add() {
            mOrderItems.add(new OrderItem());
        }

        @Override
        public int getCount() {
            return mOrderItems.size();
        }

        @Override
        public Object getItem(int position) {
            return mOrderItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.order_item, parent, false);
            return view;
        }

        private class MyViewHolder {
        }

    }

}
