package com.wizard.servlet.example.infrastructure.staticserver.support;

public enum LogLevelEnum {
	DEBUG(1), INFO(2), WARN(3), ERROR(4), FATAL(5);

	private Integer value = null;

	private LogLevelEnum(Integer value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
