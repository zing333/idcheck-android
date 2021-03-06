package com.huiyu.tech.zhongxing.utils;

import android.util.Log;

import com.huiyu.tech.zhongxing.BuildConfig;

public class LogUtils {

	private static final String TAG = "songwei";

	public static final boolean DEBUG = BuildConfig.DEBUG;
	
	public static void i(String msg){
		if(!DEBUG){
			return;
		}
		String componName = Thread.currentThread().getStackTrace()[3].getClassName();
		String className = componName.substring(componName.lastIndexOf(".")+1, componName.length());
		String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
		Log.i(TAG, TAG+" class:"+className+" called:"+methodName+" "+msg);
	}
	
	public static void e(String msg){
		if(!DEBUG){
			return;
		}
		String componName = Thread.currentThread().getStackTrace()[3].getClassName();
		String className = componName.substring(componName.lastIndexOf(".")+1, componName.length());
		String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
		Log.e(TAG, TAG+" class:"+className+" called:"+methodName+" "+msg);
	}
}
