package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

public class StaticServerContentTypeVo {

	private String groupType = null;

	private String artifactType = null;

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getArtifactType() {
		return artifactType;
	}

	public void setArtifactType(String artifactType) {
		this.artifactType = artifactType;
	}

	public String toString() {
		return groupType.concat("/").concat(artifactType);
	}

}
