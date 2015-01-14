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
import com.uct.handset.constant.JNIConstant;
import com.uct.handset.jni.JNIOperateImpl;
import com.uct.handset.jni.JNInterface;

/**
 * 
 * @author ZZP
 *         <P>
 *         库存管理
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
		// 航材
		case R.id.depot_airMaterials_btn:
			new Thread() {
				public void run() {
					String paramer = JNIConstant.READERWORKCHANNEL;
					String result = testJni.SetReaderWorkChannel(paramer);
					Log.d(TAG, "获得读写id" + result);
				};
			}.start();
			break;
		// 批次
		case R.id.depot_batch_btn:
			new Thread() {
				public void run() {
					String paramer = JNIConstant.SETINVENTORYCONFIG;
					String result = testJni.SetInventoryConfig(paramer);
					Log.d(TAG, "获得读写id" + result);
				};
			}.start();

			break;
		// 電子賬本
		case R.id.depot_bookKeeper_btn:

			break;
		// 貨位標籤
		case R.id.depot_labelLocate_btn:

			break;
		// 货位
		case R.id.depot_locate_btn:

			new Thread() {
				@Override
				public void run() {
					String result = testJni.GetReaderID();
					Log.d(TAG, "获得读写id" + result);
					super.run();
				}
			}.start();

			break;

		// 库存分布
		case R.id.depot_distributionInventory:

			break;

		default:
			break;
		}

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
