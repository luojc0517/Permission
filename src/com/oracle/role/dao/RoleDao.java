package com.oracle.role.dao;

import java.util.List;

import com.oracle.role.po.Role;


public interface RoleDao {

	public boolean add(Role role) ;
	
	public boolean del(Role role) ;
	
	public boolean update(Role role) ;
	
	public Role get(int id ) ;
	
	public List<Role> getAll() ;
	
	public boolean addAuth(Role role) ;
}
