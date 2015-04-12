package com.nasasstandroid.sstandroid.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.nasasstandroid.sstandroid.MainActivity;
import com.nasasstandroid.sstandroid.R;
import com.nasasstandroid.sstandroid.adapter.TelemetryListAadapter;

public class TelemetryListFragment extends Fragment implements
OnClickListener 
{
	View rootView;
	ArrayList<String> telemetryArrayList = new ArrayList<String>();
	ListView list_Telemetry;
	
	TelemetryListAadapter telemetryListAadapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_telemtrylist, container, false);
		loadUI();
		clickListners();
		
		telemetryListAadapter = new TelemetryListAadapter(telemetryArrayList, getActivity());
		list_Telemetry.setAdapter(telemetryListAadapter);
		list_Telemetry.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				MainActivity.changeFragmentListner.changeFramgent(new TelemetryDetailFragment(), true);

//				Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
			}
		});
		return rootView;
	}
	
	
	/**
	 * @param telemetryArrayList
	 */
	public TelemetryListFragment(ArrayList<String> telemetryArrayList) {
		super();
		this.telemetryArrayList = telemetryArrayList;
		
	}


	private void clickListners() {
		rootView.setOnClickListener(this);
	}

	private void loadUI() {
		list_Telemetry = (ListView)rootView.findViewById(R.id.list_telemetryDetail);
	}
	@Override
	public void onClick(View v) {

		//		 switch (v.getId()) {
		//				
		//				 case R.id.imageView_scanner:
		//				
		//				 break;
		//				 }
	}
	
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
	}


}
