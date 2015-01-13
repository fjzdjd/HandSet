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

	/** SD卡下的目录 */
	private final String DATABASE_PATH = "/data/data/com.uct.handset/databases";

	/** 数据库名 */
	private final String DATABASE_NAME = "orcl.db3";

	/** 这个context是必需的，没有context，怎么都不能实现数据库的拷贝操作； */
	private Context context;

	/** 数据库存放地址+数据库名 */
	private String databaseFilename;

	/** 构造函数必需传入Context，数据库的操作都带有这个参数的传入 */
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
			// 判断SD卡下是否存在存放数据库的目录，如果不存在，新建目录
			if (!dir.exists()) {
				dir.mkdir();
			} else {
				Log.i(TAG, "dir exist:" + DATABASE_PATH);
			}
			try {
				// 如果数据库已经在SD卡的目录下存在，那么不需要重新创建，否则创建文件，并拷贝/res/raw下面的数据库文件
				if (!(new File(databaseFilename)).exists()) {
					Log.i(TAG, "file not exist:" + databaseFilename);

					// /res/raw数据库作为输出流
					InputStream inputStream = this.context.getResources()
							.openRawResource(R.raw.orcl);

					/** 用于存放数据库信息的数据流 */
					FileOutputStream fileOs = new FileOutputStream(
							databaseFilename);
					byte[] buffer = new byte[1024];
					int count = 0;
					// 把数据写入SD卡目录下
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
			// 实例化sd卡上得数据库，database作为返回值，是后面所有插入，删除，查询操作的接口。
			SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(
					databaseFilename, null);
			return database;

		} catch (Exception e) {
		}
		return null;
	}

}
