package com.uct.handset.component;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.uct.handset.R;

public class CustomToast {

	private static Toast toast;

	public static Toast makeText(Context context, CharSequence text,
			int duration) {
		if (toast != null) {
			toast.cancel();
		}
		DisplayMetrics dm = context.getApplicationContext().getResources()
				.getDisplayMetrics();
		int height = dm.heightPixels;

		LinearLayout ll = (LinearLayout) LinearLayout.inflate(context,
				R.layout.custom_toast, null);
		TextView textView = (TextView) ll.findViewById(R.id.message);
		textView.setText(text);
		toast = new Toast(context);
		toast.setView(ll);
		toast.setDuration(duration);
		toast.setGravity(Gravity.CENTER, 0, height / 3);
		return toast;
	}

	public static Toast makeText(Context context, int resId, int duration) {
		if (toast != null) {
			toast.cancel();
		}
		DisplayMetrics dm = context.getApplicationContext().getResources()
				.getDisplayMetrics();
		int height = dm.heightPixels;

		LinearLayout ll = (LinearLayout) LinearLayout.inflate(context,
				R.layout.custom_toast, null);
		TextView textView = (TextView) ll.findViewById(R.id.message);
		textView.setText(resId);
		toast = new Toast(context);
		toast.setView(ll);
		toast.setDuration(duration);
		toast.setGravity(Gravity.CENTER, 0, height / 3);
		return toast;
	}

}
