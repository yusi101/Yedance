package com.example.sakurasky.yedance.Activitys;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.sakurasky.yedance.Fragments.Fragment1;
import com.example.sakurasky.yedance.Fragments.ListImgsFragment;
import com.example.sakurasky.yedance.Fragments.Fragment3;
import com.example.sakurasky.yedance.Fragments.Fragment4;
import com.example.sakurasky.yedance.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Fragment 主控制界面
 * @author yusi
 */
public class MainActivity extends FragmentActivity {
    @ViewInject(R.id.groups)
    RadioGroup rg;
    @ViewInject(R.id.content)
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mFragment;
    @ViewInject(R.id.rtns1)
    private RadioButton rb1;
    @ViewInject(R.id.rtns2)
    private RadioButton rb2;
    @ViewInject(R.id.rtns3)
    private RadioButton rb3;
    @ViewInject(R.id.rtns4)
    private RadioButton rb4;



    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        mViewPager.setCurrentItem(0);
        initView();
    }

    private void initView() {
        mFragment = new ArrayList<Fragment>();
        Fragment rb1Fragment = new Fragment1();
        Fragment rb2Fragment = new ListImgsFragment();
        Fragment rb3Fragment = new Fragment3();
        Fragment rb4Fragment = new Fragment4();
        mFragment.add(rb1Fragment);
        mFragment.add(rb2Fragment);
        mFragment.add(rb3Fragment);
        mFragment.add(rb4Fragment);
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return mFragment.size();
            }

            @Override
            public Fragment getItem(int arg0) {
                return mFragment.get(arg0);
            }
        };
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                int current = mViewPager.getCurrentItem();
                switch (current) {
                    case 0:
                        rb1.setChecked(true);
                        rb1.setTextColor(getResources().getColor(R.color.qred));
                        rb2.setTextColor(getResources().getColor(R.color.qhuise));
                        rb3.setTextColor(getResources().getColor(R.color.qhuise));
                        rb4.setTextColor(getResources().getColor(R.color.qhuise));
                        break;
                    case 1:
                        rb2.setChecked(true);
                        rb1.setTextColor(getResources().getColor(R.color.qhuise));
                        rb2.setTextColor(getResources().getColor(R.color.qred));
                        rb3.setTextColor(getResources().getColor(R.color.qhuise));
                        rb4.setTextColor(getResources().getColor(R.color.qhuise));
                        break;
                    case 2:
                        rb3.setChecked(true);
                        rb1.setTextColor(getResources().getColor(R.color.qhuise));
                        rb2.setTextColor(getResources().getColor(R.color.qhuise));
                        rb3.setTextColor(getResources().getColor(R.color.qred));
                        rb4.setTextColor(getResources().getColor(R.color.qhuise));
                        break;
                    case 3:
                        rb4.setChecked(true);
                        rb1.setTextColor(getResources().getColor(R.color.qhuise));
                        rb2.setTextColor(getResources().getColor(R.color.qhuise));
                        rb3.setTextColor(getResources().getColor(R.color.qhuise));
                        rb4.setTextColor(getResources().getColor(R.color.qred));
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arb0, float arb1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

    }

    @OnClick({R.id.rtns1, R.id.rtns2, R.id.rtns3, R.id.rtns4})
    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.rtns1:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.rtns2:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.rtns3:
                mViewPager.setCurrentItem(2);
                break;
            case R.id.rtns4:
                mViewPager.setCurrentItem(3);
                break;
        }
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
