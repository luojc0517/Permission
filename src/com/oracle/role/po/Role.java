package com.oracle.role.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.oracle.auth.po.Auth;

/**
	角色编号	role_Id		NUMBER(8)
	角色名称	roleName	VARCHAR2(20)
	角色描述	roleContent	VARCHAR2(100)
	创建人		creator		NUMBER(8)
	创建时间	createDate	Date
	修改人		updater		NUMBER(8)
	修改时间	updateDate	Date


 * @author nbskycity
 *
 */
public class Role {

	private int role_Id;
	private String roleName;
	private String roleContent;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	private Set<Auth> auths=new HashSet<Auth>();

	public Role() {}
	
	public Role(int role_Id, String roleName, String roleContent, int creator,
			Date createDate, int updater, Date updateDate, Set<Auth> auths) {
		super();
		this.role_Id = role_Id;
		this.roleName = roleName;
		this.roleContent = roleContent;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
		this.auths = auths;
	}
	
	public String getRoleContent() {
		return roleContent;
	}
	public void setRoleContent(String roleContent) {
		this.roleContent = roleContent;
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
	public Set<Auth> getAuths() {
		return auths;
	}
	public void setAuths(Set<Auth> auths) {
		this.auths = auths;
	}
	@Override
	public String toString() {
		return "Role [role_Id=" + role_Id + ", roleName=" + roleName
				+ ", roleContent=" + roleContent + ", creator=" + creator
				+ ", createDate=" + createDate + ", updater=" + updater
				+ ", updateDate=" + updateDate + ", auths=" + auths + "]";
	};
	
}
