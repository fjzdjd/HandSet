package com.uct.handset.dispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.uct.handset.R;
import com.uct.handset.component.CustomAdapter;
import com.uct.handset.dao.ReleaseDataBase;

public class OutItemContentActivity extends Activity {
	private Button mbtnBack;
	private ListView mlistOutItem;
	private TextView mtvwTagName;
	private TextView mtvwMaterialInfo;
	private TextView mtvwEstimate;
	private Button mBtnScanTag;
	private Button mBtnSpeedEnter;
	private Button mBtnEnter;
	private SQLiteDatabase database;
	private List<Map<String, Object>> itemContent;
	private TextView mtvwItemTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dispatch_material_itemcontent);
		initWidget();
		initData();
		initListener();
	}

	private void initListener() {
		mBtnEnter.setOnClickListener(new BtnOnClickListener());
		mBtnSpeedEnter.setOnClickListener(new BtnOnClickListener());
		mBtnScanTag.setOnClickListener(new BtnOnClickListener());
		mbtnBack.setOnClickListener(new BtnOnClickListener());

	}

	private void initData() {
		Intent intent = getIntent();
		String TaskID = intent.getExtras().getString("TaskID");
		database = new ReleaseDataBase(OutItemContentActivity.this)
				.OpenDataBase();
		String sql = "select * from TaskItem where _TaskID='" + TaskID + "'";
		Cursor cursor = database.rawQuery(sql, null);
		itemContent = new ArrayList<Map<String, Object>>();
		while (cursor.moveToNext()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("EPCCode",
					cursor.getString(cursor.getColumnIndex("EPCCode")));
			map.put("MaterialName",
					cursor.getString(cursor.getColumnIndex("MaterialName")));
			map.put("scanResult", "未扫描");
			itemContent.add(map);
		}
		CustomAdapter mCustomAdapter = new CustomAdapter(this, itemContent,
				R.layout.item_content_layout);
		mlistOutItem.setAdapter(mCustomAdapter);

	}

	private void initWidget() {

		mbtnBack = (Button) findViewById(R.id.backToNav_btn);
		mlistOutItem = (ListView) findViewById(R.id.dispatch_airMaterialEnterItem_list);
		mtvwItemTitle = (TextView) findViewById(R.id.item_content_txt);
		mtvwItemTitle.setText("出库任务单内容列表");
		mtvwTagName = (TextView) findViewById(R.id.taskDate);
		mtvwTagName.setText("物资信息");
		mtvwMaterialInfo = (TextView) findViewById(R.id.taskID);
		mtvwMaterialInfo.setText("判定结果");
		mtvwEstimate = (TextView) findViewById(R.id.taskName);
		mtvwEstimate.setText("标签号");

		mBtnScanTag = (Button) findViewById(R.id.checkEPC_but);
		mBtnSpeedEnter = (Button) findViewById(R.id.enterSpeedStorage_but);
		mBtnEnter = (Button) findViewById(R.id.enterStorage_but);

	}

	/**
	 * 
	 * @author ZZP
	 *         <P>
	 *         按钮点击事件
	 *         <P>
	 */
	class BtnOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			// 扫描标签
			case R.id.checkEPC_but:

				break;
			// 快捷入库
			case R.id.enterSpeedStorage_but:

				break;
			// 入库
			case R.id.enterStorage_but:

				break;
			// 返回上层
			case R.id.backToNav_btn:
				finish();
				break;

			default:
				break;
			}
		}

	}

	@Override
	protected void onStop() {

		super.onStop();
	}
}
