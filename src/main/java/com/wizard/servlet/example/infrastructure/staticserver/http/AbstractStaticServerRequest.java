package com.wizard.servlet.example.infrastructure.staticserver.http;

import java.util.Enumeration;

public abstract class AbstractStaticServerRequest {

	public abstract String getAuthType();

	public abstract long getDateHeader(String name);

	public abstract String getHeader(String name);

	public abstract Enumeration<String> getHeaders(String name);

	public abstract Enumeration<String> getHeaderNames();

	public abstract int getIntHeader(String name);

	public abstract String getMethod();

	public abstract String getPathInfo();

	public abstract String getPathTranslated();

	public abstract String getContextPath();

	public abstract String getQueryString();

	public abstract String getRemoteUser();

	public abstract String getRequestedSessionId();

	public abstract String getRequestURI();

	public abstract StringBuffer getRequestURL();

	public abstract String getServletPath();

}
