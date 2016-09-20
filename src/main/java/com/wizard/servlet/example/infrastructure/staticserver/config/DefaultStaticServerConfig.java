package com.wizard.servlet.example.infrastructure.staticserver.config;

import com.wizard.servlet.example.infrastructure.staticserver.domain.config.StaticServerGlobalVirtualHostConfigVo;

public class DefaultStaticServerConfig implements IStaticServerConfig {

	private StaticServerGlobalVirtualHostConfigVo globalVirtualHostConfig = null;

	@Override
	public StaticServerGlobalVirtualHostConfigVo getGlobalVirtualHostConfig() {
		if (null == this.globalVirtualHostConfig) {
			this.globalVirtualHostConfig = createStaticServerGlobalVirtualHostConfig();
		}
		return this.globalVirtualHostConfig;
	}

	public StaticServerGlobalVirtualHostConfigVo createStaticServerGlobalVirtualHostConfig() {
		StaticServerGlobalVirtualHostConfigVo globalVirtualHostConfig = new StaticServerGlobalVirtualHostConfigVo();
		// TODO
		return globalVirtualHostConfig;
	}

	public final void refresh() {
		this.globalVirtualHostConfig = null;
	}

	public final void init() {
		refresh();
		getGlobalVirtualHostConfig();
	}

}
