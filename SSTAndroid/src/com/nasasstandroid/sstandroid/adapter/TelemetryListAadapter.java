package com.nasasstandroid.sstandroid.adapter;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nasasstandroid.sstandroid.R;

public class TelemetryListAadapter extends BaseAdapter {

	private ArrayList<String> itemListMain = new ArrayList<String>();
	private Context context;
	private LayoutInflater inflater;

	public TelemetryListAadapter(ArrayList<String> itemListMain, Context context
			) {

		this.itemListMain = itemListMain;
		this.context = context;
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {

		return itemListMain.size();
	}

	@Override
	public Object getItem(int position) {

		return itemListMain.get(position);
	}

	@Override
	public long getItemId(int position) {

		return position;
	}


	@SuppressLint({ "ViewHolder", "NewApi" })
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view = convertView;

		view =  inflater.inflate(R.layout.adapter_telemetry_list, null);
		TextView name = (TextView)view.findViewById(R.id.txt_telemetryName);
		name.setText(itemListMain.get(position).toString());



		return view;
	}
}

