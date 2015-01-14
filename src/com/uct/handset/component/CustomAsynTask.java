package com.uct.handset.component;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.uct.handset.jni.JNInitParameter;

/**
 * 
 * @author ZZP
 *         <P>
 *         �첽����
 *         <P>
 */
public class CustomAsynTask extends AsyncTask<String, Integer, String> {

	public Context context;
	/** �������Ի��� */
	private ProgressDialog progressDialog;

	public CustomAsynTask(Context context) {
		this.context = context;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		progressDialog = new ProgressDialog(context);
		progressDialog.setTitle("����ִ����...");
		progressDialog.setMessage("��������ִ���У����Ժ�...");
		// ���öԻ����ܵ��cancel��ťȡ��
		progressDialog.setCancelable(false);
		progressDialog.setMax(100);
		// ���ý��������
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
