package com.BibleQuote.bqtj.jvm;

import com.BibleQuote.bqtj.CoreContext;
import com.BibleQuote.bqtj.jvm.utils.UpdateManagerJvm;
import com.BibleQuote.bqtj.utils.DataConstants;
import com.BibleQuote.bqtj.utils.UpdateManager;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;

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
		return new UpdateManagerJvm();
	}

	@Override
	public String getAppVersionName() {
		return "0.00.01";
	}

	@Override
	public int getAppVersionCode() {
		return 0;
	}

	@Override
	public String getAppDataPath() {
		// TODO использовать user directory ?
		// TODO продумать структуру каталогов, пока всё в папке программы

		return getJarContainingFolder(CoreContextJvm.class)
				+ File.separator + DataConstants.DATA_DIR_NAME;
	}

	@Override
	public File getSystemCacheDir() {
		// TODO getSystemCacheDir() -- пока возвращаем не системный кэш
		return new File(DataConstants.CACHE_PATH);
	}


	public static String getJarContainingFolder(Class aclass) {

		CodeSource codeSource = aclass.getProtectionDomain().getCodeSource();

		URL url = codeSource.getLocation();
		if (url == null) {
			url = aclass.getResource(aclass.getSimpleName() + ".class");
		}

		File jarFile;
		try {
			jarFile = new File(url.toURI());
		} catch(URISyntaxException e) {
			jarFile = new File(url.getPath());
		}

		return jarFile.getParentFile().getPath();
	}

}
