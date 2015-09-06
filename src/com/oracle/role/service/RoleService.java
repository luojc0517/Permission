package com.oracle.role.service;

import java.util.List;

import com.oracle.role.po.Role;

public interface RoleService {

	public boolean add(Role role);

	public boolean del(Role role);

	public boolean update(Role role);

	public Role get(int id);

	public List<Role> getAll();
	
	public boolean addAuth(Role role) ;
}
