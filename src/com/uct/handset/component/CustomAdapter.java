package com.uct.handset.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.uct.handset.R;

/**
 * 自定义适配器类
 * 
 * @author ZZP
 * 
 */
public class CustomAdapter extends BaseAdapter {

	private List<Map<String, Object>> map = null;
	private Context context;
	private int resLayout;
	private List<Integer> scanItemList = new ArrayList<Integer>();

	/** 标志扫描的标签 */
	int scanItem = -1;

	public CustomAdapter(Context context, List<Map<String, Object>> map,
			int resLayout) {
		this.context = context;
		this.map = map;
		this.resLayout = resLayout;
	}

	@Override
	public int getCount() {
		return map.size();
	}

	@Override
	public Object getItem(int position) {
		return map.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(resLayout, null);
			holder = new ViewHolder();

			holder.mTagID = (TextView) convertView.findViewById(R.id.tagID);
			holder.mMaterialInfo = (TextView) convertView
					.findViewById(R.id.materialInfo);
			holder.mEstimate = (TextView) convertView
					.findViewById(R.id.estimate);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		Map<String, Object> subMap = map.get(position);
		holder.mTagID.setText(subMap.get("EPCCode").toString());
		holder.mMaterialInfo.setText(subMap.get("MaterialName").toString());
		holder.mEstimate.setText(subMap.get("scanResult").toString());

		return convertView;
	}

	private class ViewHolder {
		public TextView mTagID;
		public TextView mMaterialInfo;
		public TextView mEstimate;

	}

	/** 设置扫描后背景，且更改扫描结果为“已匹配” */
	public void setItemViewBg(int item) {

		scanItemList.add(item);

		map.get(item).put("scanResult", "已匹配");

		for (int va : scanItemList) {

			scanItem = va;

			this.notifyDataSetChanged();
		}
	}

}
