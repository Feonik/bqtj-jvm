package com.BibleQuote.bqtj.jvm.utils;

import com.BibleQuote.bqtj.utils.ILogSys;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Nikita K.
 * Date: 03.01.14
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
public final class LogSysJvm implements ILogSys {

	private static LogSysJvm logSysJvm;

	private static Logger log = Logger.getLogger(LogSysJvm.class.getName());

	// TODO настройка Logger через logging.properties
	// если не только на консоль и иной уровень, чем INFO
	// см. http://habrahabr.ru/post/130195/

	private LogSysJvm() {
	}

	public static synchronized LogSysJvm getLogSysJvm() {

		if (logSysJvm == null) {
			logSysJvm = new LogSysJvm();
		}

		return logSysJvm;
	}


	public void d(String tag, String msg) {
		log.logp(Level.FINEST, tag, "", msg);
	}

	public void d(String tag, String msg, Throwable tr) {
		log.logp(Level.FINEST, tag, "", msg, tr);
	}

	public void e(String tag, String msg) {
		log.logp(Level.SEVERE, tag, "", msg);
	}

	public void e(String tag, String msg, Throwable tr) {
		log.logp(Level.SEVERE, tag, "", msg, tr);
	}

	public void i(String tag, String msg) {
		log.logp(Level.INFO, tag, "", msg);
	}

	public void i(String tag, String msg, Throwable tr) {
		log.logp(Level.INFO, tag, "", msg, tr);
	}

	public void w(String tag, String msg) {
		log.logp(Level.WARNING, tag, "", msg);
	}

	public void w(String tag, String msg, Throwable tr) {
		log.logp(Level.WARNING, tag, "", msg, tr);
	}

}
