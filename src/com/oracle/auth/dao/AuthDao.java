package com.oracle.auth.dao;

import java.util.List;

import com.oracle.auth.po.Auth;

public interface AuthDao {

	public boolean add(Auth auth) ;
	
	public boolean del(Auth auth) ;
	
	public boolean update(Auth auth) ;
	
	public Auth get(int id ) ;
	
	public List<Auth> getAll() ;
}
