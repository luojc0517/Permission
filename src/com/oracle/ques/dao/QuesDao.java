package com.oracle.ques.dao;

import java.util.List;
import java.util.Set;

import com.oracle.ques.po.Ques;

public interface QuesDao {

	public boolean add(Ques ques) ;
	
	public boolean del(Ques ques) ;
	
	public boolean update(Ques ques) ;
	
	public Ques get(int id ) ;
	
	public List<Ques> getATest(Set<Integer> args) ;
	
	public Integer getCount() ;
}
