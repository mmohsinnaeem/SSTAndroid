package com.nasasstandroid.sstandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasasstandroid.sstandroid.fragments.MainScreenFragment;
import com.nasasstandroid.sstandroid.listener.ChangFragmentListner;

public class MainActivity extends FragmentActivity implements
		ChangFragmentListner {

	/****************************************** Components ***************************************************/

	public static ChangFragmentListner changeFragmentListner;
	private Fragment currentFragment;
	private Context context_MainActivity;

	/****************************************** onCreate ***************************************************/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		changeFragmentListner = this;
		context_MainActivity = this;

		replaceFramgment(new MainScreenFragment(), true);
	}

	/****************************************** Replace Framgment ***************************************************/

	public void replaceFramgment(Fragment fragment, boolean addToBackStack) {
		FragmentManager mngr = getSupportFragmentManager();
		FragmentTransaction ft = mngr.beginTransaction();
		if (addToBackStack) {
			ft.addToBackStack(null);
		}
		currentFragment = fragment;
		ft.add(R.id.fragment_view, currentFragment).commitAllowingStateLoss();
		getSupportFragmentManager().executePendingTransactions();

	}

	/****************************************** Change Framgent Listner Function ***************************************************/

	@Override
	public void changeFramgent(Fragment fragment, boolean addToBackStack) {

		replaceFramgment(fragment, addToBackStack);
	}

	@Override
	public void onBackPressed() {
		try {

			FragmentManager fm = getSupportFragmentManager();
			if (fm.getBackStackEntryCount() == 0) {
				MainActivity.this.finish();
				super.onBackPressed();
			} else {
				fm.popBackStack();
			}
		} catch (Exception e) {
		}

	}

}
