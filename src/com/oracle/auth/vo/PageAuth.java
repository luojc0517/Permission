package com.oracle.auth.vo;

import java.util.Date;

public class PageAuth {

	private int auth_Id;
	private String authName;
	private String authUrl;
	private String authParentRoot;
	private String authIsRoot;
	private Date createDate;
	public PageAuth(int auth_Id, String authName, String authUrl,
			String authParentRoot, String authIsRoot, Date createDate) {
		super();
		this.auth_Id = auth_Id;
		this.authName = authName;
		this.authUrl = authUrl;
		this.authParentRoot = authParentRoot;
		this.authIsRoot = authIsRoot;
		this.createDate = createDate;
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
	public String getAuthParentRoot() {
		return authParentRoot;
	}
	public void setAuthParentRoot(String authParentRoot) {
		this.authParentRoot = authParentRoot;
	}
	public String getAuthIsRoot() {
		return authIsRoot;
	}
	public void setAuthIsRoot(String authIsRoot) {
		this.authIsRoot = authIsRoot;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
