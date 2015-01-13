package com.uct.handset.dispatch;

import com.uct.handset.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * 
 * @author ZZP
 *         <P>
 *         收发管理
 *         <P>
 *
 */
public class DispatchFragment extends Fragment implements OnClickListener {

	private View mInflater;
	private Button mbtnEnter;
	private Button mbtnOut;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mInflater = inflater
				.inflate(R.layout.dispatch_layout, container, false);
		initData();
		initWidget();
		initListener();
		return mInflater;
	}

	private void initData() {

	}

	private void initWidget() {
		mbtnEnter = (Button) mInflater
				.findViewById(R.id.dispatch_airMaterialsEnter_btn);
		mbtnOut = (Button) mInflater
				.findViewById(R.id.dispatch_airMaterialsOut_btn);
	}

	private void initListener() {
		mbtnEnter.setOnClickListener(this);
		mbtnOut.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 入库
		case R.id.dispatch_airMaterialsEnter_btn:
			Intent intent = new Intent();
			intent.setClass(getActivity(), AirMaterialEnterActivity.class);
			startActivity(intent);

			break;
		// 出库
		case R.id.dispatch_airMaterialsOut_btn:
			Intent intent1 = new Intent();
			intent1.setClass(getActivity(), AirMaterialOutActivity.class);
			startActivity(intent1);
			break;

		default:
			break;
		}

	}

}
