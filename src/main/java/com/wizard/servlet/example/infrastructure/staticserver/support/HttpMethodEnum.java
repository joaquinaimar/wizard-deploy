package com.wizard.servlet.example.infrastructure.staticserver.support;

public enum HttpMethodEnum {
	GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");

	private String value = null;

	private HttpMethodEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
