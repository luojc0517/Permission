package com.oracle.category.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.category.dao.CategoryDao;
import com.oracle.category.po.Category;
import com.oracle.category.service.CategoryService;
import com.oracle.system.SystemUtil;

public class CategoryServiceImpl implements CategoryService {

	private CategoryDao categoryDao ;
	
	
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		category.setCreator(SystemUtil.getThisUser().getUser_Id());
		category.setCreateDate(new Date());
		category.setUpdateDate(new Date());
		return categoryDao.add(category);
	}

	@Override
	public boolean del(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.del(category);
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.update(category);
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryDao.get(id);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryDao.getAll();
	}
	
	public boolean dels(int ids[]) {
		return categoryDao.dels(ids);
	}

}
