package com.oracle.role.vo;


public class AddRole {

	private int role_Id;
	private String roleName;
	@Override
	public String toString() {
		return "AddRole [role_Id=" + role_Id + ", roleName=" + roleName + "]";
	}
	public AddRole(int role_Id, String roleName) {
		super();
		this.role_Id = role_Id;
		this.roleName = roleName;
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
	
	
}
