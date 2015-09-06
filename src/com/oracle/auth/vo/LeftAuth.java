package com.oracle.auth.vo;

import java.io.Serializable;

public class LeftAuth implements Serializable {

	private int auth_Id;
	private String authName;
	private String authUrl;
	private int authParentRoot;
	private String authIsRoot;
	public LeftAuth(int auth_Id, String authName, String authUrl,
			int authParentRoot, String authIsRoot) {
		super();
		this.auth_Id = auth_Id;
		this.authName = authName;
		this.authUrl = authUrl;
		this.authParentRoot = authParentRoot;
		this.authIsRoot = authIsRoot;
	}
	public int getAuth_Id() {
		return auth_Id;
	}
	public void setAuth_Id(int auth_Id) {
		this.auth_Id = auth_Id;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthUrl() {
		return authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public int getAuthParentRoot() {
		return authParentRoot;
	}
	public void setAuthParentRoot(int authParentRoot) {
		this.authParentRoot = authParentRoot;
	}
	public String getAuthIsRoot() {
		return authIsRoot;
	}
	public void setAuthIsRoot(String authIsRoot) {
		this.authIsRoot = authIsRoot;
	}
	
	
}
