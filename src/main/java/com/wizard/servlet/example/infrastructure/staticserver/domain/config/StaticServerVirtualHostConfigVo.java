package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

import java.nio.charset.Charset;
import java.util.List;

import com.wizard.servlet.example.infrastructure.staticserver.domain.AbstractStaticServerVo;

public class StaticServerVirtualHostConfigVo extends AbstractStaticServerVo {

	private static final long serialVersionUID = 1411676215875705382L;

	private Boolean ifSsi = null;

	private Integer ssiLayerMaxCnt = null;

	private Charset contentCharset = null;

	private String contentLanguage = null;

	private List<StaticServerIpVo> ipBlacklist = null;

	private List<StaticServerIpVo> ipWhitelist = null;

	private String[] indexFiles = null;

	public Boolean getIfSsi() {
		return ifSsi;
	}

	public void setIfSsi(Boolean ifSsi) {
		this.ifSsi = ifSsi;
	}

	public Integer getSsiLayerMaxCnt() {
		return ssiLayerMaxCnt;
	}

	public void setSsiLayerMaxCnt(Integer ssiLayerMaxCnt) {
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

}
