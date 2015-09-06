package com.oracle.test.dao;

import java.util.List;

import com.oracle.test.po.Test;

public interface TestDao {

	public int add(Test test) ;
	
	public boolean del(Test test) ;
	
	public boolean update(Test test) ;
	
	public Test get(int id ) ;
	
	public List<Test> getAll() ;
}
