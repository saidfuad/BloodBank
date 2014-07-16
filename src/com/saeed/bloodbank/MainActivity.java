package com.saeed.bloodbank;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Window;

import android.os.Bundle;
import android.view.WindowManager;


public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.main);
	}

}
