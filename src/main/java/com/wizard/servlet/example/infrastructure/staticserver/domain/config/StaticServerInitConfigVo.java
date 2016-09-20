package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

import com.wizard.servlet.example.infrastructure.staticserver.config.IStaticServerConfig;
import com.wizard.servlet.example.infrastructure.staticserver.domain.AbstractStaticServerVo;
import com.wizard.servlet.example.infrastructure.staticserver.handler.IStaticServerHandler;
import com.wizard.servlet.example.infrastructure.staticserver.logger.IStaticServerLogger;
import com.wizard.servlet.example.infrastructure.staticserver.support.HttpMethodEnum;
import com.wizard.servlet.example.infrastructure.staticserver.support.LogLevelEnum;

public class StaticServerInitConfigVo extends AbstractStaticServerVo {

	private static final long serialVersionUID = 4247267168640635083L;

	private LogLevelEnum logLevel = null;

	private HttpMethodEnum[] supportMethod = null;

	private Boolean ifSupportVirtualHost = null;

	private Boolean ifSupportList = null;

	private Class<IStaticServerLogger> loggerImpl = null;

	private Class<IStaticServerConfig> configImpl = null;

	private Class<IStaticServerHandler> handlerImpl = null;

	public LogLevelEnum getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(LogLevelEnum logLevel) {
		this.logLevel = logLevel;
	}

	public HttpMethodEnum[] getSupportMethod() {
		return supportMethod;
	}

	public void setSupportMethod(HttpMethodEnum[] supportMethod) {
		this.supportMethod = supportMethod;
	}

	public Boolean getIfSupportVirtualHost() {
		return ifSupportVirtualHost;
	}

	public void setIfSupportVirtualHost(Boolean ifSupportVirtualHost) {
		this.ifSupportVirtualHost = ifSupportVirtualHost;
	}

	public Boolean getIfSupportList() {
		return ifSupportList;
	}

	public void setIfSupportList(Boolean ifSupportList) {
		this.ifSupportList = ifSupportList;
	}

	public Class<IStaticServerLogger> getLoggerImpl() {
		return loggerImpl;
	}

	public void setLoggerImpl(Class<IStaticServerLogger> loggerImpl) {
		this.loggerImpl = loggerImpl;
	}

	public Class<IStaticServerConfig> getConfigImpl() {
		return configImpl;
	}

	public void setConfigImpl(Class<IStaticServerConfig> configImpl) {
		this.configImpl = configImpl;
	}

	public Class<IStaticServerHandler> getHandlerImpl() {
		return handlerImpl;
	}

	public void setHandlerImpl(Class<IStaticServerHandler> handlerImpl) {
		this.handlerImpl = handlerImpl;
	}

}
