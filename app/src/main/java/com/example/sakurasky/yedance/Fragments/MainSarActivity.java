package com.example.sakurasky.yedance.Fragments;

import android.support.v4.app.Fragment;

import com.example.sakurasky.yedance.R;

/**
 * 图片显示界面
 */
public class MainSarActivity extends AbsSingleFragmentActivity
{
	@Override
	protected Fragment createFragment()
	{
		return new ListImgsFragment();
	}

	@Override
	protected int getLayoutId()
	{
		return R.layout.activity_single_fragment;
	}

}
