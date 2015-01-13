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
 *         航材出库
 *         <P>
 *
 */
public class AirMaterialOutActivity extends Activity implements
		OnItemClickListener {
	private static final String TAG = "AirMaterialOutActivity";

	private ListView mlistOutDepot;
	private Button mbtnBackToNav;
	private SQLiteDatabase database;
	private Cursor mcursor;
	private List<Map<String, Object>> listData;

	private String taskID;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dispatch_material_out);
		initWidget();

		initData();

		initListener();
	}

	private void initData() {
		database = new ReleaseDataBase(AirMaterialOutActivity.this)
				.OpenDataBase();
		String sql = "select * from TaskHead where TaskType = 2  and OptStep < 3";
		mcursor = database.rawQuery(sql, null);

		listData = new ArrayList<Map<String, Object>>();
		while (mcursor.moveToNext()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("taskID",
					mcursor.getString(mcursor.getColumnIndex("_TaskID")));
			map.put("taskName",
					mcursor.getString(mcursor.getColumnIndex("TaskName")));
			map.put("TaskDate",
					mcursor.getString(mcursor.getColumnIndex("TaskDate")));
			listData.add(map);
		}
		Log.d(TAG, "数据条目" + listData.size());
		CustomAdapter mCustomAdapter = new CustomAdapter(this);
		mlistOutDepot.setAdapter(mCustomAdapter);
	}

	private void initWidget() {
		mlistOutDepot = (ListView) findViewById(R.id.dispatch_airMaterialOut_list);
		mbtnBackToNav = (Button) findViewById(R.id.backToNav_btn);
		mbtnBackToNav.setText("航材出库");
		TextView mtvwOutTitle = (TextView) findViewById(R.id.airMaterialTitle);
		mtvwOutTitle.setText("航材出库");
		TextView mtitle = (TextView) findViewById(R.id.head_title_txt);
		mtitle.setText("收发管理");

	}

	private void initListener() {
		mbtnBackToNav.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();

			}
		});

		mlistOutDepot.setOnItemClickListener(this);

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
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		int result = existTaskId(position);
		if (result == 0) {
			CustomToast.makeText(this, "该任务单没有内容", Toast.LENGTH_SHORT).show();
		} else {
			Intent intent = new Intent(AirMaterialOutActivity.this,
					OutItemContentActivity.class);
			Bundle bundle = new Bundle();
			taskID = (String) listData.get(position).get("taskID");
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

	@Override
	protected void onStop() {
		// database.close();
		super.onStop();
	}
}
