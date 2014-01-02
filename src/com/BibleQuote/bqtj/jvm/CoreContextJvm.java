package com.BibleQuote.bqtj.jvm;

import com.BibleQuote.bqtj.CoreContext;
import com.BibleQuote.bqtj.utils.UpdateManager;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Nikita K.
 * Date: 12.11.13
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
public final class CoreContextJvm extends CoreContext {

	private static CoreContextJvm coreContextJvm;


	private CoreContextJvm() {
		super();
	}

	public static synchronized CoreContextJvm getCoreContextJvm() {

		if (coreContextJvm == null) {
			coreContextJvm = new CoreContextJvm();
		}

		return coreContextJvm;
	}

	@Override
	protected UpdateManager getUpdateManager() {
		return null;
	}

	@Override
	public String getAppVersionName() {
		return "";
	}

	@Override
	public int getAppVersionCode() {
		return 0;
	}

	@Override
	public String getAppDataPath() {
		return "";
	}

	@Override
	public File getSystemCacheDir() {
		return null;
	}

	public static String GetExecutionPath(Object context){
		String absolutePath = context.getClass().getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		absolutePath = absolutePath.substring(0, absolutePath.lastIndexOf("/"));
		return absolutePath;
	}

}
