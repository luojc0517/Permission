package com.oracle.category.dao;

import java.util.List;

import com.oracle.category.po.Category;

public interface CategoryDao {

	public boolean add(Category category) ;
	
	public boolean del(Category category) ;
	
	public boolean dels(int ids[]) ;
	
	public boolean update(Category category) ;
	
	public Category get(int id ) ;
	
	public List<Category> getAll() ;
}
