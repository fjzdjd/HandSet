package com.uct.handset;

import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.uct.handset.Repair.RepairFragment;
import com.uct.handset.depot.DepotFragment;
import com.uct.handset.dispatch.DispatchFragment;
import com.uct.handset.engine.EngineFragment;

/**
 * 
 * @author ZZP
 *
 */
public class MainActivity extends FragmentActivity implements OnClickListener {

	private Button mbtn_back;
	private Button mbtn_menu;
	private static TextView mtxt_title;

	private Button mbtn_RepairFragment;
	private Button mbtn_DepotFragment;
	private Button mbtn_DispatchFragment;
	private Button mbtn_EngineFragment;

	private FragmentManager mFragmentManager = null;

	private static Boolean isQuit = false;
	private Timer timer = new Timer();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initData();
		initWidget();
		initListener();
		defaultFragment();

	}

	/** ��ʼ������ */
	private void initData() {

	}

	/** ��ʼ����� */
	private void initWidget() {

		mbtn_menu = (Button) findViewById(R.id.head_menu_btn);
		mtxt_title = (TextView) findViewById(R.id.head_title_txt);
		mbtn_back = (Button) findViewById(R.id.head_back_btn);

		mbtn_RepairFragment = (Button) findViewById(R.id.tab_RepairFragment);
		mbtn_DepotFragment = (Button) findViewById(R.id.tab_DepotFragment);
		mbtn_DispatchFragment = (Button) findViewById(R.id.tab_DispatchFragment);
		mbtn_EngineFragment = (Button) findViewById(R.id.tab_EngineFragment);

	}

	/** ��ʼ������ */
	private void initListener() {
		mbtn_RepairFragment.setOnClickListener(this);
		mbtn_DepotFragment.setOnClickListener(this);
		mbtn_DispatchFragment.setOnClickListener(this);
		mbtn_EngineFragment.setOnClickListener(this);
		mbtn_back.setOnClickListener(this);
		mbtn_menu.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// �������
		case R.id.tab_RepairFragment:
			Fragment repairFragment = new RepairFragment();
			if (null == mFragmentManager)
				mFragmentManager = getSupportFragmentManager();
			FragmentTransaction transaction = mFragmentManager
					.beginTransaction().replace(R.id.content_container,
							repairFragment);
			mtxt_title.setText("�������");
			transaction.commit();

			break;
		// ������
		case R.id.tab_DepotFragment:
			defaultFragment();

			break;

		// �շ�����
		case R.id.tab_DispatchFragment:
			Fragment dispatchFragment = new DispatchFragment();
			if (null == mFragmentManager)
				mFragmentManager = getSupportFragmentManager();
			FragmentTransaction transaction2 = mFragmentManager
					.beginTransaction().replace(R.id.content_container,
							dispatchFragment);
			mtxt_title.setText("�շ�����");
			transaction2.commit();
			break;

		// ����������
		case R.id.tab_EngineFragment:
			Fragment engineFragment = new EngineFragment();
			if (null == mFragmentManager)
				mFragmentManager = getSupportFragmentManager();
			FragmentTransaction transaction3 = mFragmentManager
					.beginTransaction().replace(R.id.content_container,
							engineFragment);
			mtxt_title.setText("����������");
			transaction3.commit();

			break;

		case R.id.head_back_btn:

			break;

		case R.id.head_menu_btn:

			break;

		default:
			break;
		}

	}

	/** Ĭ�Ͻ��� */
	public void defaultFragment() {
		Fragment depotFragment = new DepotFragment();
		if (null == mFragmentManager)
			mFragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction1 = mFragmentManager.beginTransaction()
				.replace(R.id.content_container, depotFragment);
		mtxt_title.setText("������");
		transaction1.commit();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (isQuit == false) {
				isQuit = true;
				Toast.makeText(getBaseContext(), "�ٴε��ȷ���˳����",
						Toast.LENGTH_SHORT).show();
				TimerTask task = null;
				task = new TimerTask() {
					@Override
					public void run() {
						isQuit = false;
					}
				};
				timer.schedule(task, 2000);
			} else {
				finish();
			}
		} else {
		}
		return false;
	}

}
