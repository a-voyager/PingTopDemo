package top.wuhaojie.pingtopdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tab_main)
    TabLayout mTabLayout;
    @Bind(R.id.vp_main)
    ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();

    }

    private void initViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("拼途");
        mTabLayout.addTab(mTabLayout.newTab().setText("精选"));
        mTabLayout.addTab(mTabLayout.newTab().setText("发现"));
        mTabLayout.addTab(mTabLayout.newTab().setText("行程"));
        mTabLayout.addTab(mTabLayout.newTab().setText("我"));


//        View listView = LayoutInflater.from(this).inflate(R.layout.news, mViewPager, true);


//        listView.addView(LayoutInflater.from(this).inflate(R.layout.news_item, listView, true));
//        mViewPager.addView(listView, 0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
