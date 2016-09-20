package com.wizard.servlet.example.infrastructure.staticserver.logger;

public interface IStaticServerLogger {

	public void debug(Object message);

	public void debug(Object message, Throwable t);

	public boolean isDebugEnabled();

	public void info(Object message);

	public void info(Object message, Throwable t);

	public boolean isInfoEnabled();

	public void warn(Object message);

	public void warn(Object message, Throwable t);

	public boolean isWarnEnabled();

	public void error(Object message);

	public void error(Object message, Throwable t);

	public boolean isErrorEnabled();

	public void fatal(Object message);

	public void fatal(Object message, Throwable t);

}
