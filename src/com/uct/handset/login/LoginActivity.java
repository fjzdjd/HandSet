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
 *         ��½
 *         <P>
 *
 */
public class LoginActivity extends Activity implements OnClickListener {

	private static final String TAG = "LoginActivity";

	/** �û��༭�� */
	private EditText mUsername;
	/** ȡ����ť */
	private Button mBtnCancel;
	/** ��½��ť */
	private Button mBtnOK;
	/** ��������� */
	private EditText mPassword;
	/** ��ס���� */
	private CheckBox mRemeberPassword;
	/** ���� */
	private String password;
	/** �û��� */
	private String username;
	private SQLiteDatabase database;
	private Cursor cursor;

	/**
	 * ��ʼ��jni
	 */
	JNInterface operatJNI = new JNIOperateImpl();

	/**
	 * ��ȡ��дID
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

	/** ִ�е�½ */
	public void executeLogin() {
		// ��ȡ�û������û���������
		password = mPassword.getText().toString();
		username = mUsername.getText().toString();
		if (TextUtils.isEmpty(username)) {
			CustomToast.makeText(this, "�������û���", Toast.LENGTH_SHORT).show();
		} else if (TextUtils.isEmpty(password)) {
			CustomToast.makeText(this, "����������", Toast.LENGTH_SHORT).show();
		} else {
			database = new ReleaseDataBase(LoginActivity.this).OpenDataBase();
			String sql = "select * from Staff where Name='" + username
					+ "' and Password='" + password + "'";

			cursor = database.rawQuery(sql, null);

			if (!cursor.moveToFirst()) {
				CustomToast.makeText(this, "�˺Ż��������!", Toast.LENGTH_SHORT)
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
		// ��ס����
		case R.id.login_save_password_ckb:

			break;
		// ȡ����ť
		case R.id.login_cancel_btn:
			System.exit(0);
			break;
		// ��½��ť
		case R.id.login_ok_btn:
			// readerId = operatJNI.GetReaderID();
			// readerId = operatJNI.GetReaderVersion();
			// Log.d(TAG, readerId);
			// if (readerId != null) {
			// executeLogin();// ִ�е�½
			// } else {
			// CustomToast.makeText(this, "�豸δ����ȷ����!", Toast.LENGTH_SHORT)
			// .show();
			// }
			executeLogin();// ִ�е�½
			break;

		default:
			break;
		}

	}
}
