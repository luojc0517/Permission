package com.oracle.role.vo;

import java.util.Date;

public class PageRole {

	private int role_Id;
	private String roleName;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	public PageRole(int role_Id, String roleName, int creator, Date createDate,
			int updater, Date updateDate) {
		super();
		this.role_Id = role_Id;
		this.roleName = roleName;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}
	public int getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getCreator() {
		return creator;
	}
	public void setCreator(int creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getUpdater() {
		return updater;
	}
	public void setUpdater(int updater) {
		this.updater = updater;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "PageRole [role_Id=" + role_Id + ", roleName=" + roleName
				+ ", creator=" + creator + ", createDate=" + createDate
				+ ", updater=" + updater + ", updateDate=" + updateDate + "]";
	}
	
	
}
