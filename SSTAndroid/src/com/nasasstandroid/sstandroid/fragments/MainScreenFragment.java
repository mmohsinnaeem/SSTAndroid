package com.nasasstandroid.sstandroid.fragments;

import java.util.ArrayList;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.nasasstandroid.sstandroid.MainActivity;
import com.nasasstandroid.sstandroid.R;

public class MainScreenFragment extends Fragment implements OnClickListener {
	View rootView;
	ArrayList<String> telmentryIdList;
	RelativeLayout rl_Telemetry_Adco, rl_Telemetry_Cornus, rl_Telemetry_Ethos,
			rl_Telemetry_Eva, rl_Telemetry_Time, rl_Telemetry_Spartan,
			rl_Telemetry_Topo, rl_Telemetry_Vvo;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_mainscreen, container,
				false);
		loadUI();
		clickListners();
		telmentryIdList = new ArrayList<String>();
		telmentryIdList.add("ADCOabc001");
		telmentryIdList.add("ADCOabc002");
		telmentryIdList.add("ADCOabc003");
		telmentryIdList.add("ADCOabc004");
		telmentryIdList.add("ADCOabc005");
		telmentryIdList.add("ADCOabc006");
		telmentryIdList.add("ADCOabc007");
		telmentryIdList.add("ADCOabc008");

		return rootView;
	}

	private void clickListners() {
		rootView.setOnClickListener(this);
		rl_Telemetry_Adco.setOnClickListener(this);
		rl_Telemetry_Cornus.setOnClickListener(this);
		rl_Telemetry_Ethos.setOnClickListener(this);
		rl_Telemetry_Eva.setOnClickListener(this);
		rl_Telemetry_Time.setOnClickListener(this);
		rl_Telemetry_Spartan.setOnClickListener(this);
		rl_Telemetry_Topo.setOnClickListener(this);
		rl_Telemetry_Vvo.setOnClickListener(this);
	}

	private void loadUI() {
		rl_Telemetry_Adco = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_adco);
		rl_Telemetry_Cornus = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_cronus);
		rl_Telemetry_Ethos = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_ethos);
		rl_Telemetry_Eva = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_eva);
		rl_Telemetry_Time = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_time);
		rl_Telemetry_Spartan = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_spartan);
		rl_Telemetry_Topo = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_topo);
		rl_Telemetry_Vvo = (RelativeLayout) rootView
				.findViewById(R.id.rl_telemetry_vvo);
		loadAnimation();

	}

	@SuppressLint("NewApi")
	private void loadAnimation() {
		rl_Telemetry_Adco.setScaleX(0f);
		rl_Telemetry_Adco.setScaleY(0f);

		rl_Telemetry_Cornus.setScaleX(0f);
		rl_Telemetry_Cornus.setScaleY(0f);

		rl_Telemetry_Ethos.setScaleX(0f);
		rl_Telemetry_Ethos.setScaleY(0f);

		rl_Telemetry_Eva.setScaleX(0f);
		rl_Telemetry_Eva.setScaleY(0f);

		rl_Telemetry_Time.setScaleX(0f);
		rl_Telemetry_Time.setScaleY(0f);

		rl_Telemetry_Spartan.setScaleX(0f);
		rl_Telemetry_Spartan.setScaleY(0f);

		rl_Telemetry_Topo.setScaleX(0f);
		rl_Telemetry_Topo.setScaleY(0f);

		rl_Telemetry_Vvo.setScaleX(0f);
		rl_Telemetry_Vvo.setScaleY(0f);

		ObjectAnimator anim1 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Adco,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Cornus,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim3 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Ethos,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim4 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Eva,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim5 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Time,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim6 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Spartan,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim7 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Topo,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);
		ObjectAnimator anim8 = ObjectAnimator.ofPropertyValuesHolder(
				rl_Telemetry_Vvo,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 0f, 1f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 0f, 1f))
				.setDuration(200);

		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.playSequentially(anim1, anim2, anim3, anim4, anim5, anim6,
				anim7, anim8);
		animatorSet.start();

	}

	@Override
	public void onClick(View v) {
		animateTheView(v);

	}

	@SuppressLint("NewApi")
	private void animateTheView(final View v) {
		ObjectAnimator anim = ObjectAnimator.ofPropertyValuesHolder(v,
				PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 8f),
				PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 8f))
				.setDuration(400);
		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.play(anim);
		animatorSet.addListener(new AnimatorListener() {

			@Override
			public void onAnimationStart(Animator animation) {

			}

			@Override
			public void onAnimationRepeat(Animator animation) {

			}

			@Override
			public void onAnimationEnd(Animator animation) {
				handleCLick(v);
				v.setScaleX(1f);
				v.setScaleY(1f);
			}

			@Override
			public void onAnimationCancel(Animator animation) {

			}
		});
		animatorSet.start();

	}

	private void handleCLick(View v) {
		switch (v.getId()) {

		case R.id.rl_telemetry_adco:

			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_cronus:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_ethos:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_eva:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_time:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_spartan:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_topo:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		case R.id.rl_telemetry_vvo:
			MainActivity.changeFragmentListner.changeFramgent(
					new TelemetryListFragment(telmentryIdList), true);

			break;
		}
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
	}

}
