package com.animationdirectory;

import android.util.Log;

import com.animationdirectory.Constants.Config;

public class LogUtils {

	public static void LOGD(final String tag, String message) {
		if (Config.DEVELOPER_MODE) {
			Log.d(tag, message);
		}
	}

	public static void LOGV(final String tag, String message) {
		if (Config.DEVELOPER_MODE) {
			Log.v(tag, message);
		}
	}

	public static void LOGI(final String tag, String message) {
		if (Config.DEVELOPER_MODE) {
			Log.i(tag, message);
		}
	}

	public static void LOGW(final String tag, String message) {
		if (Config.DEVELOPER_MODE) {
			Log.w(tag, message);
		}
	}

	public static void LOGE(final String tag, String message) {
		if (Config.DEVELOPER_MODE) {
			Log.e(tag, message);
		}
	}


}
