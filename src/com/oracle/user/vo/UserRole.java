package com.oracle.user.vo;

import java.util.HashSet;
import java.util.Set;

import com.oracle.role.po.Role;

public class UserRole {
	
	private int user_Id;
	private Set<Role> roles=new HashSet<Role>();

	public UserRole(int user_Id, Set<Role> roles) {
		super();
		this.user_Id = user_Id;
		this.roles = roles;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
