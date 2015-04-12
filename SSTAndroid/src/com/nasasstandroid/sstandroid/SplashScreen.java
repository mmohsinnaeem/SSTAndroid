package com.nasasstandroid.sstandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	//****************************** Splash Screen ******************************//
	Handler handler;
	private long delayMillis = 3000;
	private Context context_SplashScreen;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		
		handler = new Handler();
		context_SplashScreen = this;
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				
				Intent intent = new Intent(context_SplashScreen,MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, delayMillis );
		
		
	}
}
