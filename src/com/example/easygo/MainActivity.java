package com.example.easygo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements OnClickListener {
	private ImageButton bottom_imagebtn_01;
	private ImageButton bottom_imagebtn_02;
	private ViewPager viewpager;
	private List<Fragment> mFragments;
	private FirstFragment first = new FirstFragment();
	private SecondFragment second = new SecondFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		viewpager = (ViewPager) findViewById(R.id.viewpager);
		mFragments = new ArrayList<Fragment>();
		mFragments.add(first);
		mFragments.add(second);
		MyAdapter myadapter = new MyAdapter(getSupportFragmentManager(), mFragments);
		viewpager.setAdapter(myadapter);
	}

	public void initView() {
		// TODO Auto-generated method stub
		bottom_imagebtn_01 = (ImageButton) findViewById(R.id.bottom_imagebtn_message);
		bottom_imagebtn_02 = (ImageButton) findViewById(R.id.bottom_imagebtn_admin);
		bottom_imagebtn_01.setOnClickListener(this);
		bottom_imagebtn_02.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
