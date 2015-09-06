package com.oracle.user.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.oracle.auth.po.Auth;
import com.oracle.auth.service.AuthService;
import com.oracle.auth.vo.LeftAuth;
import com.oracle.role.po.Role;
import com.oracle.role.service.RoleService;
import com.oracle.system.SystemUtil;
import com.oracle.user.po.User;
import com.oracle.user.service.UserService;

public class UserAction {

	
	private User user;
	private String id;
	private List<User> users ;
	private UserService userService;
	private Integer auths[] ;
	private Integer roles[] ;
	private AuthService authService;
	private RoleService roleService;
	private List<LeftAuth> leftAuths; 
	
	public List<LeftAuth> getLeftAuths() {
		return leftAuths;
	}
	public void setLeftAuths(List<LeftAuth> leftAuths) {
		this.leftAuths = leftAuths;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public Integer[] getRoles() {
		return roles;
	}
	public void setRoles(Integer[] roles) {
		this.roles = roles;
	}
	public Integer[] getAuths() {
		return auths;
	}
	public void setAuths(Integer[] auths) {
		this.auths = auths;
	}
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	public String login() {
		System.out.println("login user..."+user.getUserName());
		User u=userService.login(user);
		if(u != null ) {
			SystemUtil.setThisUser(u);
			return "login";
		} else {
			return "fail";
		}
	}
	
	public String add() {
		System.out.println("add user..."+user.toString());
		userService.add(user);
		return "add";
	}
	public String get() {
		System.out.println("get "+id+" user...");
		this.setUser(userService.get(Integer.valueOf(id)));
		System.out.println(user.toString());
		return "get";
	}
	public String update() {
		System.out.println("update "+user.getUser_Id()+" user...");
		System.out.println(user.toString());
		userService.update(user);
		return "add";
	}
	public String del() {
		System.out.println(id);
		User u = userService.get(Integer.valueOf(id));
		System.out.println("del user..."+u.getUser_Id());
		userService.del(u);
		return "add";
	}
	public String getAll() {
		this.setUsers(userService.getAll());
		return "getAll";
	}
	public String addAuth() {	
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> add auth "+id+" , auth : "+auths+"\n<== end Log ==>\n");
		User u=userService.get(Integer.valueOf(id));
		Set<Auth> aut=new HashSet<Auth>();
		if(auths == null) {
			aut=null;
		} else {
			for(int i=0;i<auths.length;i++) {
				System.out.println("=================i:"+i);
				Auth au=authService.get(auths[i]);
				aut.add(au);
			}
		}
		u.setAuths(aut);
		userService.addAuth(u);
		return "add";
	}
	public String addRole() {
		System.out.println("\n<== Log ==> \n"+new Date()+" ==> add role "+id+" , role : "+roles+"\n<== end Log ==>\n");
		User u=userService.get(Integer.valueOf(id));
		Set<Auth> alAuth=u.getAuths();
		Set<Role> rls=new HashSet<Role>();
		Set<Auth> aut=new HashSet<Auth>();
		if(roles == null) {
			aut=null;
			rls=null;
		} else {
			for(int i=0;i<roles.length;i++) {
				Role rl=roleService.get(roles[i]);
				for(Auth a:rl.getAuths()) {
					aut.add(a);
				}
				rls.add(rl);
			}
		}
		for(Auth a:alAuth) {
			aut.add(a);
		}
		u.setRoles(rls);
		u.setAuths(aut);
		userService.addAuth(u);
		return "add";
	}
	
	public String getLeft() {
		Set<Auth> ats=userService.get(SystemUtil.getThisUser().getUser_Id()).getAuths();
		List<LeftAuth> las=new ArrayList<LeftAuth>();
		for(Auth a:ats) {
			LeftAuth la=new LeftAuth(a.getAuth_Id(),a.getAuthName(),a.getAuthUrl(),a.getAuthParentRoot(),a.getAuthIsRoot());
			las.add(la);
		}
		ActionContext.getContext().getSession().put("leftAuths", las);
		return "tologin";
	}
}
