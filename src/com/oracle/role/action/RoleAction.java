package com.oracle.role.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.oracle.auth.po.Auth;
import com.oracle.auth.service.AuthService;
import com.oracle.role.po.Role;
import com.oracle.role.service.RoleService;
import com.oracle.role.vo.AddRole;
import com.oracle.role.vo.PageRole;
import com.oracle.user.po.User;
import com.oracle.user.service.UserService;
import com.oracle.user.vo.UserRole;

public class RoleAction {

	
	private Role role;
	private int id;
//	private List<Role> roles ;
	private List<AddRole> addRoles ;
	private List<PageRole> roles;
	private RoleService roleService;
	private UserService userService;
	private AuthService authService;
	private UserRole user;
	private Integer auths[];
	
	
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	public Integer[] getAuths() {
		return auths;
	}
	public void setAuths(Integer[] auths) {
		this.auths = auths;
	}
	public UserRole getUser() {
		return user;
	}
	public void setUser(UserRole user) {
		this.user = user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<AddRole> getAddRoles() {
		return addRoles;
	}
	public void setAddRoles(List<AddRole> addRoles) {
		this.addRoles = addRoles;
	}
	public List<PageRole> getRoles() {
		return roles;
	}
	public void setRoles(List<PageRole> roles) {
		this.roles = roles;
	}
	
	
	public String add() {
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> add a auth "+role.toString()+"\n<== end Log ==>\n");
		roleService.add(role);
		return "add";
	}
	public String get() {
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> get a auth , id = "+id+"\n<== end Log ==>");
		this.setRole(roleService.get(id));
		return "get";
	}
	public String update() {
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> update a auth "+role.toString()+"\n<== end Log ==>\n");
		roleService.update(role);
		return "add";
	}
	public String del() {
		Role r=roleService.get(id);
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> del a auth "+r.toString()+"\n<== end Log ==>\n");
		roleService.del(r);
		return "add";
	}
	
	public List<Role> getAllRoles() {
		return roleService.getAll();
	}
	public String getAll() {
		List<Role> rls=this.getAllRoles();
		List<PageRole> prs=new ArrayList<PageRole>();
		for(Role a:rls) {
			PageRole ar=new PageRole(a.getRole_Id(),a.getRoleName(),a.getCreator(),a.getCreateDate(),a.getUpdater(),a.getUpdateDate());
			prs.add(ar);
		}
		this.setRoles(prs);
		return "getAll";
	}
	public String addUser() {
		List<Role> rls=this.getAllRoles();
		List<AddRole> ars=new ArrayList<AddRole>();
		for(Role a:rls) {
			AddRole ar=new AddRole(a.getRole_Id(),a.getRoleName());
			ars.add(ar);
		}
		this.setAddRoles(ars);
		this.setRoles(null);
		User u=userService.get(id);
		this.setUser(new UserRole(u.getUser_Id(),u.getRoles()));
		return "addUser";
	}
	public String addAuth() {
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> add auth to role , role id : "+id+" , auth : "+auths+"\n<== end Log ==>\n");
		Role r=roleService.get(Integer.valueOf(id));
		Set<Auth> aut=new HashSet<Auth>();
		for(int i=0;i<auths.length;i++) {
			Auth au=authService.get(auths[i]);
			aut.add(au);
		}
		r.setAuths(aut);
		roleService.addAuth(r);
		return "add";
	}
}
