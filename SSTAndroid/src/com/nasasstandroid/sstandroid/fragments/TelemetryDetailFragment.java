package com.nasasstandroid.sstandroid.fragments;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.nasasstandroid.sstandroid.MainActivity;
import com.nasasstandroid.sstandroid.R;
import com.nasasstandroid.sstandroid.SplashScreen;

public class TelemetryDetailFragment extends Fragment implements
		OnClickListener {
	TextView txt_Detail_Name, txt_Detail_Description, txt_Detail_Digit;
	View rootView;
	Handler mHandler = new Handler();
	Animation shakeAnimation;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_telemtrydetails,
				container, false);
		shakeAnimation = AnimationUtils.loadAnimation(getActivity(),
				R.anim.shake);
		loadUI();
		clickListners();
		return rootView;
	}

	private void clickListners() {
		rootView.setOnClickListener(this);
	}

	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			updateValue();
		}
	};

	private void loadUI() {
		txt_Detail_Name = (TextView) rootView
				.findViewById(R.id.txt_detail_Name);
		txt_Detail_Description = (TextView) rootView
				.findViewById(R.id.txt_detail_description);
		txt_Detail_Digit = (TextView) rootView
				.findViewById(R.id.txt_detail_Digit);
		TranslateAnimation anim = new TranslateAnimation(0, 0, 1000f, 0);
		anim.setDuration(1000);
		anim.setFillAfter(true);
		txt_Detail_Digit.startAnimation(anim);
		txt_Detail_Digit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				genrateLocalNotification();
			}
		});
		mHandler.postDelayed(runnable, 5000);
	}

	@Override
	public void onPause() {

		mHandler.removeCallbacks(runnable);
		super.onPause();
	}

	protected void updateValue() {
		genrateLocalNotification();
		mHandler.removeCallbacks(runnable);
		mHandler.postDelayed(runnable, 5000);
		txt_Detail_Digit.startAnimation(shakeAnimation);

	}

	public void genrateLocalNotification() {
		NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
				getActivity()).setSmallIcon(R.drawable.app_logo)
				.setContentTitle("ISS").setContentText("Wow! Check what is happening in space..");
		// Creates an explicit intent for an Activity in your app
		Intent resultIntent = new Intent(getActivity(), SplashScreen.class);

		// The stack builder object will contain an artificial back stack for
		// the
		// started Activity.
		// This ensures that navigating backward from the Activity leads out of
		// your application to the Home screen.
		TaskStackBuilder stackBuilder = TaskStackBuilder.create(getActivity());
		// Adds the back stack for the Intent (but not the Intent itself)
		stackBuilder.addParentStack(MainActivity.class);
		// Adds the Intent that starts the Activity to the top of the stack
		stackBuilder.addNextIntent(resultIntent);
		PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,
				PendingIntent.FLAG_UPDATE_CURRENT);
		mBuilder.setContentIntent(resultPendingIntent);
		NotificationManager mNotificationManager = (NotificationManager) getActivity()
				.getSystemService(Context.NOTIFICATION_SERVICE);
		// mId allows you to update the notification later on.
		mNotificationManager.notify(12, mBuilder.build());
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
	}

}
