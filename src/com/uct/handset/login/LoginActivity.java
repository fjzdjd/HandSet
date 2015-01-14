package com.uct.handset.login;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.uct.handset.MainActivity;
import com.uct.handset.R;
import com.uct.handset.component.CustomToast;
import com.uct.handset.constant.CommonConstant;
import com.uct.handset.dao.ReleaseDataBase;
import com.uct.handset.depot.DepotFragment;
import com.uct.handset.jni.JNIOperateImpl;
import com.uct.handset.jni.JNInterface;

/**
 * 
 * @author ZZP
 *         <P>
 *         登陆
 *         <P>
 *
 */
public class LoginActivity extends Activity implements OnClickListener {

	private static final String TAG = "LoginActivity";

	/** 用户编辑框 */
	private EditText mUsername;
	/** 取消按钮 */
	private Button mBtnCancel;
	/** 登陆按钮 */
	private Button mBtnOK;
	/** 密码输入框 */
	private EditText mPassword;
	/** 记住密码 */
	private CheckBox mRemeberPassword;
	/** 密码 */
	private String password;
	/** 用户名 */
	private String username;
	private SQLiteDatabase database;
	private Cursor cursor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.login_layout);
		initData();
		initWidget();
		initListener();
	}

	private void initWidget() {
		mRemeberPassword = (CheckBox) findViewById(R.id.login_save_password_ckb);
		mBtnCancel = (Button) findViewById(R.id.login_cancel_btn);
		mBtnOK = (Button) findViewById(R.id.login_ok_btn);

		mPassword = (EditText) findViewById(R.id.login_password_edt);
		mUsername = (EditText) findViewById(R.id.login_username_edt);

	}

	private void initListener() {
		mBtnCancel.setOnClickListener(this);
		mBtnOK.setOnClickListener(this);
		mRemeberPassword.setOnClickListener(this);

	}

	private void initData() {

	}

	/** 执行登陆 */
	public void executeLogin() {
		// 获取用户输入用户名和密码
		password = mPassword.getText().toString();
		username = mUsername.getText().toString();
		if (TextUtils.isEmpty(username)) {
			CustomToast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
		} else if (TextUtils.isEmpty(password)) {
			CustomToast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
		} else {
			database = new ReleaseDataBase(LoginActivity.this).OpenDataBase();
			String sql = "select * from Staff where Name='" + username
					+ "' and Password='" + password + "'";

			cursor = database.rawQuery(sql, null);

			if (!cursor.moveToFirst()) {
				CustomToast.makeText(this, "账号或密码错误!", Toast.LENGTH_SHORT)
						.show();

			} else {
				Intent intent = new Intent(LoginActivity.this,
						MainActivity.class);
				Bundle bundle = new Bundle();
				bundle.putString("readerID", resultID);
				intent.putExtras(bundle);
				startActivity(intent);

				startActivity(intent);
			}

		}
	}

	/** 取得返回ID */
	private static String resultID;

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 记住密码
		case R.id.login_save_password_ckb:

			break;
		// 取消按钮
		case R.id.login_cancel_btn:
			System.exit(0);
			break;
		// 登陆按钮
		case R.id.login_ok_btn:
			final LoginAsycnTask asycnTask = new LoginAsycnTask(
					LoginActivity.this);
			asycnTask.execute(getReaderID());
			new Thread() {
				public void run() {
					try {
						asycnTask.get(CommonConstant.TIMEOUT,
								TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					} catch (TimeoutException e) {
						e.printStackTrace();
						/* 在这里处理超时异常，但是不能直接修改UI线程，必须开启Handler */
					}
				};
			}.start();

			break;

		default:
			break;
		}

	}

	/**
	 * 获得ReaderID
	 */
	public static String getReaderID() {

		/** 初始化jni */
		JNInterface operatJNI = new JNIOperateImpl();

		String readerId = operatJNI.GetReaderID();
		Log.d(TAG, "读写器ID" + readerId);

		return null;
	}

	class LoginAsycnTask extends AsyncTask<String, Integer, String> {

		public Context context;
		/** 进度条对话框 */
		private ProgressDialog progressDialog;

		public LoginAsycnTask(Context context) {
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
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setIndeterminate(false);
			progressDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {

			try {
				resultID = params[0].toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;

		}

		@Override
		protected void onPostExecute(String result) {

			super.onPostExecute(result);

			progressDialog.dismiss();
			executeLogin();// 执行登陆

		}

	}

}
