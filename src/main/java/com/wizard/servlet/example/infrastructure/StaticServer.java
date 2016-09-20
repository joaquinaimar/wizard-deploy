package com.wizard.servlet.example.infrastructure;

import com.wizard.servlet.example.infrastructure.staticserver.domain.config.StaticServerInitConfigVo;

public class StaticServer {

	private StaticServer staticServer = null;

	private StaticServerInitConfigVo initConfig = null;

	private StaticServer() {

	}

	public StaticServer getInstance() {
		if (null != this.staticServer) {
			this.staticServer = new StaticServer();
			this.staticServer.init();
		}
		return this.staticServer;
	}

	public void init() {
		this.initConfig = getInitConfig();
	}

	private StaticServerInitConfigVo getInitConfig() {
		if (null == this.initConfig) {
			this.initConfig = new StaticServerInitConfigVo();
		}
		return this.initConfig;
	}
}
