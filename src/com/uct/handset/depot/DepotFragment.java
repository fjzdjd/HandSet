package com.uct.handset.depot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.uct.handset.R;
import com.uct.handset.jni.JNIOperateImpl;
import com.uct.handset.jni.JNInterface;

/**
 * 
 * @author ZZP
 *         <P>
 *         ������
 *         <P>
 *
 */
public class DepotFragment extends Fragment implements OnClickListener {

	private static final String TAG = "DepotFragment";
	JNInterface testJni = new JNIOperateImpl();
	private View mInflater;
	private Button mbtnAirMaterial;
	private Button mbtnBatch;
	private Button mbtnBook;
	private Button mbtnLabelLocate;
	private Button mbtnDepotLocate;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mInflater = inflater.inflate(R.layout.depot_layout, null);
		initData();
		initWidget();
		initListener();
		return mInflater;
	}

	private void initListener() {
		mbtnAirMaterial.setOnClickListener(this);
		mbtnBatch.setOnClickListener(this);
		mbtnBook.setOnClickListener(this);
		mbtnLabelLocate.setOnClickListener(this);
		mbtnDepotLocate.setOnClickListener(this);

	}

	private void initWidget() {
		mbtnAirMaterial = (Button) mInflater
				.findViewById(R.id.depot_airMaterials_btn);
		mbtnBatch = (Button) mInflater.findViewById(R.id.depot_batch_btn);
		mbtnBook = (Button) mInflater.findViewById(R.id.depot_bookKeeper_btn);
		mbtnLabelLocate = (Button) mInflater
				.findViewById(R.id.depot_labelLocate_btn);
		mbtnDepotLocate = (Button) mInflater
				.findViewById(R.id.depot_locate_btn);

	}

	private void initData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.depot_airMaterials_btn:
			new Thread() {
				@Override
				public void run() {
					Log.d(TAG, "��ö�дid" + testJni.GetReaderID());
					super.run();
				}
			}.start();

			break;
		case R.id.depot_batch_btn:
			new Thread() {
				@Override
				public void run() {
					Log.d(TAG, "��İ汾��Ϣ" + testJni.GetReaderVersion());
					super.run();
				}
			}.start();

			break;
		case R.id.depot_bookKeeper_btn:
			new Thread() {
				@Override
				public void run() {
					Log.d(TAG, testJni.GetInventoryConfig());
					super.run();
				}
			}.start();

			break;
		case R.id.depot_labelLocate_btn:
			new Thread() {
				@Override
				public void run() {
					Log.d(TAG, testJni.GetReaderTxPower());
					super.run();
				}
			}.start();

			break;
		case R.id.depot_locate_btn:
			new Thread() {
				@Override
				public void run() {
					Log.d(TAG, testJni.GetReaderWorkChannel());
					super.run();
				}
			}.start();

			break;

		default:
			break;
		}

	}
}
