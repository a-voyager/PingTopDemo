package top.wuhaojie.pingtopdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaojie on 2016/4/14 20:42.
 */
public class RouteRecyclerAdapter extends RecyclerView.Adapter {

    private Context mContext;

    public RouteRecyclerAdapter(Context context) {
        mContext = context;
        mItems.add(new Item("问道青城山，访水都江堰", mContext.getResources().getDrawable(R.drawable.news_1)));
    }

    public void add() {
        mItems.add(0, new Item("美食成都，天堂九寨", mContext.getResources().getDrawable(R.drawable.news_1)));
        notifyItemInserted(mItems.size() - 1);
    }

    private List<Item> mItems = new ArrayList<>();


    public class Item {
        public Item(String text, Drawable drawable) {
            mText = text;
            mDrawable = drawable;
        }

        public String mText;
        public Drawable mDrawable;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.route_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder v = (ViewHolder) holder;
        v.mTextView.setText(mItems.get(position).mText);
        v.mImageView.setImageDrawable(mItems.get(position).mDrawable);
    }


    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mImageView = (ImageView) itemView.findViewById(R.id.iv_route);
            mTextView = (TextView) itemView.findViewById(R.id.tv_route);
        }

    }

}
