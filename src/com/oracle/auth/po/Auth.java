package com.oracle.auth.po;

import java.util.Date;

/**
 *	编号			auth_Id			NUMBER(8)
	权限名称		authName		VARCHAR2(20）
	权限URL		authUrl			VARCHAR2(20)	
	权限父节点		authParentRoot	NUMBER(8)	
	是否为根节点		authIsRoot		VARCHAR2(2)	
	创建人			creator			NUMBER(8)
	创建时间		createDate		Date	
	修改人			updater			NUMBER(8)	
	修改时间		updateDate		Date

 * @author nbskycity
 *
 */
public class Auth {

	private int auth_Id;
	private String authName;
	private String authUrl;
	private int authParentRoot;
	private String authIsRoot;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	public Auth() {}

	public Auth(int auth_Id, String authName, String authUrl,
			int authParentRoot, String authIsRoot, int creator,
			Date createDate, int updater, Date updateDate) {
		super();
		this.auth_Id = auth_Id;
		this.authName = authName;
		this.authUrl = authUrl;
		this.authParentRoot = authParentRoot;
		this.authIsRoot = authIsRoot;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}

	public int getCreator() {
		return creator;
	}

	public void setCreator(int creator) {
		this.creator = creator;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Auth [auth_Id=" + auth_Id + ", authName=" + authName
				+ ", authUrl=" + authUrl + ", authParentRoot=" + authParentRoot
				+ ", authIsRoot=" + authIsRoot + ", creator=" + creator
				+ ", createDate=" + createDate + ", updater=" + updater
				+ ", updateDate=" + updateDate + "]";
	}

	
}
