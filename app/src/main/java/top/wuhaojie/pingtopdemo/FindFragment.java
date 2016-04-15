package top.wuhaojie.pingtopdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by wuhaojie on 2016/4/15 21:22.
 */
public class FindFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.find, container, false);
        WebView web = (WebView) view.findViewById(R.id.web_found);
        web.loadUrl(Constants.URL);
        return view;
    }
}
