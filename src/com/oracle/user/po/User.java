package com.oracle.user.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.oracle.auth.po.Auth;
import com.oracle.role.po.Role;

/**
	 编号		user_Id			NUMBER(8)
	姓名		userName		VARCHAR2(20)
	密码		password		VARCHAR2(20)
	真实姓名	userTrueName	VARCHAR2(20)
	用户状态	userState		VARCHAR2(2)
	创建人		creator			NUMBER(8)
	创建时间	createDate		Date
	修改人		updater			NUMBER(8)
	修改时间	updateDate		Date

 * @author nbskycity
 *
 */
public class User {

	private int user_Id;
	private String userName;
	private String password;
	private String userTrueName;
	private String userState;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	private Set<Auth> auths=new HashSet<Auth>();
	private Set<Role> roles=new HashSet<Role>();
	
	public User() {}

	public User(int user_Id, String userName, String password,
			String userTrueName, String userState, int creator,
			Date createDate, int updater, Date updateDate, Set<Auth> auths,
			Set<Role> roles) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
		this.password = password;
		this.userTrueName = userTrueName;
		this.userState = userState;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
		this.auths = auths;
		this.roles = roles;
	}



	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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

	public Set<Auth> getAuths() {
		return auths;
	}
	public void setAuths(Set<Auth> auths) {
		this.auths = auths;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserTrueName() {
		return userTrueName;
	}
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
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
		return "User [user_Id=" + user_Id + ", userName=" + userName
				+ ", password=" + password + ", userTrueName=" + userTrueName
				+ ", userState=" + userState + ", creator=" + creator
				+ ", createDate=" + createDate + ", updater=" + updater
				+ ", updateDate=" + updateDate + ", auths=" + auths + "]";
	}
	
}
