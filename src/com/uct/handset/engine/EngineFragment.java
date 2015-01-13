package com.uct.handset.engine;

import com.uct.handset.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * @author ZZP
 *         <P>
 *         发动机管理
 *         <P>
 *
 */
public class EngineFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View mInflater = inflater.inflate(R.layout.engine_layout, null);

		return mInflater;
	}
}
