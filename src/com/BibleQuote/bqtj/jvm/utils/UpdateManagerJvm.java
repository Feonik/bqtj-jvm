package com.BibleQuote.bqtj.jvm.utils;

import com.BibleQuote.bqtj.CoreContext;
import com.BibleQuote.bqtj.utils.IUpdateManager;
import com.BibleQuote.bqtj.utils.Log;

import java.io.*;

public class UpdateManagerJvm implements IUpdateManager {

	private final static String TAG = "UpdateManager";


	public void Init() {

		// Инициализация каталога программы
		File dir_modules = new File(CoreContext.FS_MODULES_PATH);
		if (!dir_modules.exists()) {
			Log.i(TAG, String.format("Create directory %1$s", dir_modules));
			dir_modules.mkdirs();
		}

	}

}
