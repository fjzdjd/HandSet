package com.uct.handset.component;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.uct.handset.jni.JNInitParameter;

/**
 * 
 * @author ZZP
 *         <P>
 *         异步加载
 *         <P>
 */
public class CustomAsynTask extends AsyncTask<String, Integer, String> {

	public Context context;
	/** 进度条对话框 */
	private ProgressDialog progressDialog;

	public CustomAsynTask(Context context) {
		this.context = context;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		progressDialog = new ProgressDialog(context);
		progressDialog.setTitle("任务执行中...");
		progressDialog.setMessage("任务正在执行中，请稍后...");
		// 设置对话框不能点击cancel按钮取消
		progressDialog.setCancelable(false);
		progressDialog.setMax(100);
		// 设置进度条风格
		progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		progressDialog.setIndeterminate(false);
		progressDialog.show();
	}

	@Override
	protected void onProgressUpdate(Integer... values) {
		super.onProgressUpdate(values);

	}

	@Override
	protected String doInBackground(String... params) {

		String result = JNInitParameter.INIT_VALUE;

		return result;
	}

	@Override
	protected void onPostExecute(String result) {

		super.onPostExecute(result);
	}

}
