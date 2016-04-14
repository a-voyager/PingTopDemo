package top.wuhaojie.pingtopdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by wuhaojie on 2016/4/14 15:25.
 */
public class NewFragment extends Fragment {

    Button mButton;
    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.news, container, false);
        mButton = (Button) mRootView.findViewById(R.id.btn_test);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), PayActivity.class));
            }
        });

        return mRootView;
    }

}
