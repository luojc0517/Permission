package com.oracle.test.service;

import java.util.List;

import com.oracle.test.po.Test;

public interface TestService {

	public int add(Test test);

	public boolean del(Test test);

	public Test get(int id);

	public boolean update(Test test) ;
	
	public List<Test> getAll();
}
