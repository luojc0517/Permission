package com.oracle.category.service;

import java.util.List;

import com.oracle.category.po.Category;

public interface CategoryService {

	public boolean add(Category category);

	public boolean del(Category category);
	
	public boolean dels(int ids[]);

	public boolean update(Category category);

	public Category get(int id);

	public List<Category> getAll();
}
