package com.oracle.auth.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.oracle.auth.po.Auth;
import com.oracle.auth.service.AuthService;
import com.oracle.auth.vo.PageAuth;
import com.oracle.role.po.Role;
import com.oracle.role.service.RoleService;
import com.oracle.user.po.User;
import com.oracle.user.service.UserService;

public class AuthAction {

	
	private Auth auth;
	private int id;
	private AuthService authService;
	private UserService userService;
	private RoleService roleService;
	private User user;
	private List<PageAuth> auths;
	private Role role;

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Auth getAuth() {
		return auth;
	}
	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<PageAuth> getAuths() {
		return auths;
	}
	public void setAuths(List<PageAuth> auths) {
		this.auths = auths;
	}
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}



	public String add() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> add a auth "+auth.toString()+" \n<== end Log ==>\n");
		authService.add(auth);
		return "add";
	}
	//根据 auth_Id 取得单个 Auth
	public String get() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> get a auth, id="+id+" \n<== end Log ==>\n");
		this.setAuth(authService.get(id));
		return "get";
	}
	//修改权限操作
	public String update() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> update auth "+auth.toString()+" \n<== end Log ==>\n");
		authService.update(auth);
		return "add";
	}
	//删除权限操作
	public String del() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> del auth, id= "+id+" \n<== end Log ==>\n");
		Auth a=authService.get(id);
		authService.del(a);
		return "add";
	}
	
	public void pageAuths() {
		List<Auth> aus=this.getAllAuth();
		List<PageAuth> pas=new ArrayList<PageAuth>();
		String parentName=null;
		for(Auth a:aus) {
			if(a.getAuthIsRoot().equals("否")) {
				Auth at=authService.get(a.getAuthParentRoot());
				parentName=at.getAuthName();
			} else {
				parentName="无";
			}
			PageAuth pa=new PageAuth(a.getAuth_Id(),a.getAuthName(),a.getAuthUrl(),parentName,a.getAuthIsRoot(),a.getCreateDate());
			pas.add(pa);
		}
		this.setAuths(pas);
	}
	
	public String addUser(){
		this.pageAuths();//复制权限值
		this.setUser(userService.get(id));
		return "addUser";
	}
	public List<Auth> getAllAuth() {
		return authService.getAll();
	}
	public String getAll() {
		this.pageAuths();
		return "getAll";
	}
	public String addRole(){
		this.pageAuths();
		this.setRole(roleService.get(id));
		return "addRole";
	}
	
}
