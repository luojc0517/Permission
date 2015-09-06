package com.oracle.user.dao;

import java.util.List;

import com.oracle.user.po.User;

public interface UserDao {

	public boolean add(User user) ;
	
	public boolean del(User user) ;
	
	public boolean update(User user) ;
	
	public User get(int id ) ;
	
	public List<User> getAll() ;
	
	public User login(User user) ;
	
	public boolean addAuth(User user) ;
}
