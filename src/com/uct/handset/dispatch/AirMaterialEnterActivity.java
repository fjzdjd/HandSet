package com.uct.handset.dispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.uct.handset.R;
import com.uct.handset.component.CustomToast;
import com.uct.handset.dao.ReleaseDataBase;

/**
 * 
 * @author ZZP
 *         <P>
 *         收发管理-航材入库单
 *         <P>
 */
public class AirMaterialEnterActivity extends Activity implements
		OnItemClickListener {

	private static String TAG = "AirMaterialEnterActivity";
	private ListView mlistEnterDepot;
	private Button mbtnBackToNav;
	private TextView mtitle;
	private CustomAdapter mCustomAdapter;
	/** 获取数据库操作实例 */
	private static SQLiteDatabase database;
	/** 数据库返回数据 */
	private List<Map<String, Object>> listData;
	/** 任务ID */
	private String taskID;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dispatch_material_enter);
		initWidget();
		initData();
		initListener();
	}

	private void initWidget() {
		mlistEnterDepot = (ListView) findViewById(R.id.dispatch_airMaterialEnter_list);
		mbtnBackToNav = (Button) findViewById(R.id.backToNav_btn);
		mtitle = (TextView) findViewById(R.id.head_title_txt);
		mtitle.setText("收发管理");
	}

	private void initData() {
		database = new ReleaseDataBase(AirMaterialEnterActivity.this)
				.OpenDataBase();
		String sql = " select * from TaskHead where TaskType = 1  and OptStep < 3";
		Cursor cursor = database.rawQuery(sql, null);
		listData = new ArrayList<Map<String, Object>>();
		while (cursor.moveToNext()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("taskID",
					cursor.getString(cursor.getColumnIndex("_TaskID")));
			map.put("taskName",
					cursor.getString(cursor.getColumnIndex("TaskName")));
			map.put("TaskDate",
					cursor.getString(cursor.getColumnIndex("TaskDate")));
			listData.add(map);
		}
		Log.d(TAG, "数据条目" + listData.size());
		mCustomAdapter = new CustomAdapter(this);
		mlistEnterDepot.setAdapter(mCustomAdapter);
		cursor.close();
	}

	/** 初始化监听 */
	private void initListener() {

		mbtnBackToNav.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();

			}
		});

		mlistEnterDepot.setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		int result = existTaskId(position);
		if (result == 0) {
			CustomToast.makeText(this, "该任务单没有内容", Toast.LENGTH_SHORT).show();
		} else {
			Intent intent = new Intent(AirMaterialEnterActivity.this,
					EnterItemContentActivity.class);
			Bundle bundle = new Bundle();
			bundle.putString("TaskID", taskID);
			intent.putExtras(bundle);
			startActivity(intent);
		}
	}

	/**
	 * 
	 * @param position
	 *            条目位置
	 * @return (integer)result default 0
	 */
	public int existTaskId(int position) {
		int result = 0;
		taskID = (String) listData.get(position).get("taskID");
		String sql = "select * from taskitem where _TaskID='" + taskID + "'";
		Cursor cursor = database.rawQuery(sql, null);
		if (cursor.moveToFirst()) {
			result = 1;
		}

		return result;
	}

	private class ViewHolderAirME {
		public TextView mTaskID;
		public TextView mTaskName;
		public TextView mTaskDate;

	}

	class CustomAdapter extends BaseAdapter {

		private LayoutInflater inflater;

		public CustomAdapter(Context context) {
			inflater = LayoutInflater.from(context);
		}

		@Override
		public int getCount() {

			return listData.size();
		}

		@Override
		public Object getItem(int position) {

			return listData.get(position);
		}

		@Override
		public long getItemId(int position) {

			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			ViewHolderAirME holder = null;
			if (convertView == null) {
				convertView = inflater.inflate(R.layout.item_layout, null);
				holder = new ViewHolderAirME();
				holder.mTaskName = (TextView) convertView
						.findViewById(R.id.taskName);
				holder.mTaskID = (TextView) convertView
						.findViewById(R.id.taskID);
				holder.mTaskDate = (TextView) convertView
						.findViewById(R.id.taskDate);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolderAirME) convertView.getTag();
			}

			holder.mTaskID.setText((String) listData.get(position)
					.get("taskID"));
			holder.mTaskName.setText((String) listData.get(position).get(
					"taskName"));
			holder.mTaskDate.setText((String) listData.get(position).get(
					"TaskDate"));

			return convertView;
		}

	}

	@Override
	protected void onStop() {

		super.onStop();
	}

}
