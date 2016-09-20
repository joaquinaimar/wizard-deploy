package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import com.wizard.servlet.example.infrastructure.staticserver.domain.AbstractStaticServerVo;

public class StaticServerGlobalVirtualHostConfigVo extends AbstractStaticServerVo {

	private static final long serialVersionUID = -3371889356901781162L;

	private String forwordLoginUrl = null;

	private Charset forwordLoginCharset = null;

	private int bufSize = 0;

	private long contentMaxLength = 0l;

	private Map<String, StaticServerContentTypeVo> contentType = null;

	private Boolean ifSsi = null;

	private int ssiLayerMaxCnt = 0;

	private Charset contentCharset = null;

	private String contentLanguage = null;

	private List<StaticServerIpVo> ipBlacklist = null;

	private List<StaticServerIpVo> ipWhitelist = null;

	private String[] indexFiles = null;

	private Map<String, StaticServerVirtualHostConfigVo> virtualHostConfigMap = null;

	public String getForwordLoginUrl() {
		return forwordLoginUrl;
	}

	public void setForwordLoginUrl(String forwordLoginUrl) {
		this.forwordLoginUrl = forwordLoginUrl;
	}

	public Charset getForwordLoginCharset() {
		return forwordLoginCharset;
	}

	public void setForwordLoginCharset(Charset forwordLoginCharset) {
		this.forwordLoginCharset = forwordLoginCharset;
	}

	public int getBufSize() {
		return bufSize;
	}

	public void setBufSize(int bufSize) {
		this.bufSize = bufSize;
	}

	public long getContentMaxLength() {
		return contentMaxLength;
	}

	public void setContentMaxLength(long contentMaxLength) {
		this.contentMaxLength = contentMaxLength;
	}

	public Map<String, StaticServerContentTypeVo> getContentType() {
		return contentType;
	}

	public void setContentType(Map<String, StaticServerContentTypeVo> contentType) {
		this.contentType = contentType;
	}

	public boolean getIfSsi() {
		return ifSsi;
	}

	public void setIfSsi(boolean ifSsi) {
		this.ifSsi = ifSsi;
	}

	public int getSsiLayerMaxCnt() {
		return ssiLayerMaxCnt;
	}

	public void setSsiLayerMaxCnt(int ssiLayerMaxCnt) {
		this.ssiLayerMaxCnt = ssiLayerMaxCnt;
	}

	public Charset getContentCharset() {
		return contentCharset;
	}

	public void setContentCharset(Charset contentCharset) {
		this.contentCharset = contentCharset;
	}

	public String getContentLanguage() {
		return contentLanguage;
	}

	public void setContentLanguage(String contentLanguage) {
		this.contentLanguage = contentLanguage;
	}

	public List<StaticServerIpVo> getIpBlacklist() {
		return ipBlacklist;
	}

	public void setIpBlacklist(List<StaticServerIpVo> ipBlacklist) {
		this.ipBlacklist = ipBlacklist;
	}

	public List<StaticServerIpVo> getIpWhitelist() {
		return ipWhitelist;
	}

	public void setIpWhitelist(List<StaticServerIpVo> ipWhitelist) {
		this.ipWhitelist = ipWhitelist;
	}

	public String[] getIndexFiles() {
		return indexFiles;
	}

	public void setIndexFiles(String[] indexFiles) {
		this.indexFiles = indexFiles;
	}

	public Map<String, StaticServerVirtualHostConfigVo> getVirtualHostConfigMap() {
		return virtualHostConfigMap;
	}

	public void setVirtualHostConfigMap(Map<String, StaticServerVirtualHostConfigVo> virtualHostConfigMap) {
		this.virtualHostConfigMap = virtualHostConfigMap;
	}

	public StaticServerVirtualHostConfigVo getVirtualHostConfig(String virtualHostName) {
		return virtualHostConfigMap.get(virtualHostName);
	}

	public Boolean getIfSsi(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getIfSsi()
				&& !"".equals(virtualHostConfig.getIfSsi())) {
			return virtualHostConfig.getIfSsi();
		} else {
			return getIfSsi();
		}
	}

	public Integer getSsiLayerMaxCnt(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getSsiLayerMaxCnt()) {
			return virtualHostConfig.getSsiLayerMaxCnt();
		} else {
			return getSsiLayerMaxCnt();
		}
	}

	public Charset getContentCharset(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getContentCharset()) {
			return virtualHostConfig.getContentCharset();
		} else {
			return getContentCharset();
		}
	}

	public String getContentLanguage(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getContentLanguage()
				&& !"".equals(virtualHostConfig.getIfSsi())) {
			return virtualHostConfig.getContentLanguage();
		} else {
			return getContentLanguage();
		}
	}

	public List<StaticServerIpVo> getIpBlacklist(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getIpBlacklist()
				&& !virtualHostConfig.getIpBlacklist().isEmpty()) {
			return virtualHostConfig.getIpBlacklist();
		} else {
			return getIpBlacklist();
		}
	}

	public List<StaticServerIpVo> getIpWhitelist(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getIpWhitelist()
				&& !virtualHostConfig.getIpWhitelist().isEmpty()) {
			return virtualHostConfig.getIpWhitelist();
		} else {
			return getIpWhitelist();
		}
	}

	public String[] getIndexFiles(String virtualHostName) {
		StaticServerVirtualHostConfigVo virtualHostConfig = this.getVirtualHostConfig(virtualHostName);
		if (null != virtualHostConfig && null != virtualHostConfig.getIndexFiles()
				&& 0 != virtualHostConfig.getIndexFiles().length) {
			return virtualHostConfig.getIndexFiles();
		} else {
			return getIndexFiles();
		}
	}

}
