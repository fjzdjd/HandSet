package com.uct.handset.dispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.R.integer;
import android.R.layout;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.uct.handset.R;
import com.uct.handset.R.drawable;
import com.uct.handset.component.CustomAdapter;
import com.uct.handset.dao.ReleaseDataBase;

/**
 * 
 * @author ZZP
 *         <P>
 *         �շ�����-������ⵥ-��Ŀ����
 *         <P>
 */
public class EnterItemContentActivity extends Activity implements
		OnItemClickListener {

	private Button mbtnBack;
	private ListView mlistEnterItem;
	private TextView mtvwTagName;
	private TextView mtvwMaterialInfo;
	private TextView mtvwEstimate;
	private Button mBtnScanTag;
	private Button mBtnSpeedEnter;
	private Button mBtnEnter;
	private SQLiteDatabase database;
	private List<Map<String, Object>> itemContent;
	private View popupView;
	private ListView popupList;
	private String[] popupListData = { "��Ŀһ", "��Ŀ��" };
	private PopupWindow popupWindow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dispatch_material_itemcontent);
		initWidget();
		initData();
		initListener();
	}

	private void initWidget() {
		mbtnBack = (Button) findViewById(R.id.backToNav_btn);
		mlistEnterItem = (ListView) findViewById(R.id.dispatch_airMaterialEnterItem_list);

		mtvwTagName = (TextView) findViewById(R.id.taskDate);
		mtvwTagName.setText("������Ϣ");
		mtvwMaterialInfo = (TextView) findViewById(R.id.taskID);
		mtvwMaterialInfo.setText("�ж����");
		mtvwEstimate = (TextView) findViewById(R.id.taskName);
		mtvwEstimate.setText("��ǩ��");

		mBtnScanTag = (Button) findViewById(R.id.checkEPC_but);
		mBtnSpeedEnter = (Button) findViewById(R.id.enterSpeedStorage_but);
		mBtnEnter = (Button) findViewById(R.id.enterStorage_but);
	}

	private void initData() {
		Intent intent = getIntent();
		String TaskID = intent.getExtras().getString("TaskID");
		database = new ReleaseDataBase(EnterItemContentActivity.this)
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
			map.put("scanResult", "δɨ��");
			itemContent.add(map);
		}
		CustomAdapter mCustomAdapter = new CustomAdapter(this, itemContent,
				R.layout.item_content_layout);
		mlistEnterItem.setAdapter(mCustomAdapter);

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		showPopupWindow(view);
	}

	/**
	 * ��ʾ���ݴ���
	 */
	public void showPopupWindow(View view) {
		if (popupWindow == null) {
			LayoutInflater inflater = (LayoutInflater) getApplicationContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			popupView = inflater.inflate(R.layout.popup_layout, null);
			popupList = (ListView) popupView.findViewById(R.id.popup_list);

			ArrayAdapter<String> popupAdapter = new ArrayAdapter<String>(
					EnterItemContentActivity.this, R.layout.array_item,
					popupListData);
			popupList.setAdapter(popupAdapter);

			popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT);
		}

		popupWindow.setBackgroundDrawable(getResources().getDrawable(
				R.drawable.main_bg));
		// ����������������ʧ
		popupWindow.setOutsideTouchable(true);
		// ʹ��ۼ�
		popupWindow.setFocusable(true);

		popupWindow.showAsDropDown(view, 0, 0);

		popupList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				popupWindow.dismiss();
			}
		});

	}

	private void initListener() {
		mBtnEnter.setOnClickListener(new BtnOnClickListener());
		mBtnSpeedEnter.setOnClickListener(new BtnOnClickListener());
		mBtnScanTag.setOnClickListener(new BtnOnClickListener());
		mbtnBack.setOnClickListener(new BtnOnClickListener());
		mlistEnterItem.setOnItemClickListener(this);

	}

	/**
	 * 
	 * @author ZZP
	 *         <P>
	 *         ��ť����¼�
	 *         <P>
	 */
	class BtnOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			// ɨ���ǩ
			case R.id.checkEPC_but:

				break;
			// ������
			case R.id.enterSpeedStorage_but:

				break;
			// ���
			case R.id.enterStorage_but:

				break;
			// �����ϲ�
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
