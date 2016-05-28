package com.example.edwin.googleplayd.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.example.edwin.googleplayd.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.main_drawer_layout)
    private DrawerLayout mDrawerLayout;

    @InjectView(R.id.main_drawer_layout)
    private PagerSlidingTabStrip mTabs;

    @InjectView(R.id.main_drawer_layout)
    private ViewPager mViewPager;

    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化界面
        initView();
        //初始化ActionBar
        initActionBar();
        //初始化数据
        initData();
        //初始化事件
        initEvent();
    }

    /**
     * @desc 设置ActionBar
     */
    private void initActionBar() {
        //V7兼容包下的ActionBar
        ActionBar supportActionBar = getSupportActionBar();
        //设置标题栏
        supportActionBar.setTitle("GooglePlay");
        //设置显示系统后退按钮
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        initActionBarDrawerToggle();

    }

    /**
     * @desc 设置回退按钮
     */
    private void initActionBarDrawerToggle() {

        //获取回退按钮的对象
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        //设置按钮的同步
        mToggle.syncState();

        //设置拖动侧滑菜单栏时能够按钮能够跟着改变状态
        mDrawerLayout.addDrawerListener(mToggle);

    }

    /**
     * @desc 初始化界面
     */
    private void initView() {
        //设置界面布局
        setContentView(R.layout.activity_main);
        //在Activity中可以这样使用   在Fragment获取其他中需要指定两个参数
        ButterKnife.inject(this);
    }

    /**
     * @param item
     * @return
     * @desc 设置按钮的点击事件
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //当点击按钮时,让侧滑菜单跟着一起开启或关闭
                mToggle.onOptionsItemSelected(item);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * @desc 初始化数据
     */
    private void initData() {

    }

    /**
     * @desc 初始化事件
     */
    private void initEvent() {

    }
}
