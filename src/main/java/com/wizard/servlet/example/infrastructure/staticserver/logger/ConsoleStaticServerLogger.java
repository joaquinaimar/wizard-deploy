package com.wizard.servlet.example.infrastructure.staticserver.logger;

import com.wizard.servlet.example.infrastructure.staticserver.support.LogLevelEnum;

public class ConsoleStaticServerLogger implements IStaticServerLogger {

	@Override
	public void debug(Object message) {
		debug(message, null);
	}

	@Override
	public void debug(Object message, Throwable t) {
		if (isDebugEnabled())
			printLog(LogLevelEnum.DEBUG, message, t);
	}

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public void info(Object message) {
		info(message, null);
	}

	@Override
	public void info(Object message, Throwable t) {
		if (isDebugEnabled())
			printLog(LogLevelEnum.INFO, message, t);
	}

	@Override
	public boolean isInfoEnabled() {
		return true;
	}

	@Override
	public void warn(Object message) {
		warn(message, null);
	}

	@Override
	public void warn(Object message, Throwable t) {
		if (isDebugEnabled())
			printLog(LogLevelEnum.WARN, message, t);
	}

	@Override
	public boolean isWarnEnabled() {
		return true;
	}

	@Override
	public void error(Object message) {
		error(message, null);
	}

	@Override
	public void error(Object message, Throwable t) {
		if (isDebugEnabled())
			printLog(LogLevelEnum.ERROR, message, t);
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public void fatal(Object message) {
		fatal(message, null);
	}

	@Override
	public void fatal(Object message, Throwable t) {
		if (isDebugEnabled())
			printLog(LogLevelEnum.FATAL, message, t);
	}

	public void printLog(LogLevelEnum level, Object message, Throwable t) {
		StringBuffer sb = new StringBuffer();
		sb.append(level).append(":");
		sb.append(message);
		if (null != t)
			sb.append("\r\n").append(t.getMessage());
		System.out.println(sb.toString());
	}
	
	public boolean isLogLevelEnabled(LogLevelEnum level) {
		return true;
	}

}
