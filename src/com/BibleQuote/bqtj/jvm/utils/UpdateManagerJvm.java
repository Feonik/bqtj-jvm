package com.BibleQuote.bqtj.jvm.utils;

import com.BibleQuote.bqtj.CoreContext;
import com.BibleQuote.bqtj.utils.DataConstants;
import com.BibleQuote.bqtj.utils.IUpdateManager;
import com.BibleQuote.bqtj.utils.Log;
import com.BibleQuote.bqtj.utils.UpdateManager;

import java.io.*;

public class UpdateManagerJvm extends UpdateManager {

	private final static String TAG = "UpdateManager";

	public UpdateManagerJvm() {
		super();
	}

	@Override
	protected void updateBuiltInModules() {
	}

	@Override
	protected void saveTSK() {
	}

}
