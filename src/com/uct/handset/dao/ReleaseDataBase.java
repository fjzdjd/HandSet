package com.uct.handset.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import com.uct.handset.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ReleaseDataBase {
	private static final String TAG = "ReleaseDataBase";

	/** SD���µ�Ŀ¼ */
	private final String DATABASE_PATH = "/data/data/com.uct.handset/databases";

	/** ���ݿ��� */
	private final String DATABASE_NAME = "orcl.db3";

	/** ���context�Ǳ���ģ�û��context����ô������ʵ�����ݿ�Ŀ��������� */
	private Context context;

	/** ���ݿ��ŵ�ַ+���ݿ��� */
	private String databaseFilename;

	/** ���캯�����贫��Context�����ݿ�Ĳ�����������������Ĵ��� */
	public ReleaseDataBase(Context context) {
		this.context = context;
	}

	/***
	 * OpenDataBase
	 * 
	 * @return sqliteDatabase
	 */
	public SQLiteDatabase OpenDataBase() {
		try {
			databaseFilename = DATABASE_PATH + "/" + DATABASE_NAME;
			File dir = new File(DATABASE_PATH);
			// �ж�SD�����Ƿ���ڴ�����ݿ��Ŀ¼����������ڣ��½�Ŀ¼
			if (!dir.exists()) {
				dir.mkdir();
			} else {
				Log.i(TAG, "dir exist:" + DATABASE_PATH);
			}
			try {
				// ������ݿ��Ѿ���SD����Ŀ¼�´��ڣ���ô����Ҫ���´��������򴴽��ļ���������/res/raw��������ݿ��ļ�
				if (!(new File(databaseFilename)).exists()) {
					Log.i(TAG, "file not exist:" + databaseFilename);

					// /res/raw���ݿ���Ϊ�����
					InputStream inputStream = this.context.getResources()
							.openRawResource(R.raw.orcl);

					/** ���ڴ�����ݿ���Ϣ�������� */
					FileOutputStream fileOs = new FileOutputStream(
							databaseFilename);
					byte[] buffer = new byte[1024];
					int count = 0;
					// ������д��SD��Ŀ¼��
					while ((count = inputStream.read(buffer)) > 0) {
						fileOs.write(buffer, 0, count);
					}
					fileOs.flush();
					fileOs.close();
					inputStream.close();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// ʵ����sd���ϵ����ݿ⣬database��Ϊ����ֵ���Ǻ������в��룬ɾ������ѯ�����Ľӿڡ�
			SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(
					databaseFilename, null);
			return database;

		} catch (Exception e) {
		}
		return null;
	}

}
