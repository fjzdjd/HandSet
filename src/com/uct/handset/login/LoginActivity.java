package com.uct.handset.login;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import com.uct.handset.dao.ReleaseDataBase;
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

	/**
	 * 初始化jni
	 */
	JNInterface operatJNI = new JNIOperateImpl();

	/**
	 * 获取读写ID
	 */
	private String readerId;

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
				startActivity(intent);
			}

		}
	}

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
			// readerId = operatJNI.GetReaderID();
			// readerId = operatJNI.GetReaderVersion();
			// Log.d(TAG, readerId);
			// if (readerId != null) {
			// executeLogin();// 执行登陆
			// } else {
			// CustomToast.makeText(this, "设备未能正确连接!", Toast.LENGTH_SHORT)
			// .show();
			// }
			executeLogin();// 执行登陆
			break;

		default:
			break;
		}

	}
}
