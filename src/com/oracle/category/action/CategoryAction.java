package com.oracle.category.action;

import java.util.Date;
import java.util.List;

import com.oracle.category.po.Category;
import com.oracle.category.service.CategoryService;

public class CategoryAction {

	
	private Category categ;
	private int id;
	private List<Category> categs ;
	private CategoryService categoryService;
	private int selectid[];
	
	public int[] getSelectid() {
		return selectid;
	}
	public void setSelectid(int[] selectid) {
		this.selectid = selectid;
	}
	public Category getCateg() {
		return categ;
	}
	public void setCateg(Category categ) {
		this.categ = categ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Category> getCategs() {
		return categs;
	}
	public void setCategs(List<Category> categs) {
		this.categs = categs;
	}
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	
	public String add() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> add a categ "+categ.toString()+" \n<== end Log ==>\n");
		categoryService.add(categ);
		return "add";
	}
	public String update() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> update a categ "+categ.toString()+" \n<== end Log ==>\n");
		categoryService.update(categ);
		return "add";
	}
	public String get() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> get a categ , id = "+id+" \n<== end Log ==>\n");
		this.setCateg(categoryService.get(id));
		return "get";
	}
	public String del() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> del a categ , id = "+id+" \n<== end Log ==>\n");
		categoryService.del((categoryService.get(id)));
		return "add";
	}
	public String dels() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> del some categ , id = "+selectid[0]+" and id = "+selectid[1]+" \n<== end Log ==>\n");
		categoryService.dels(selectid);
		return "add";
	}
	public String getAll() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> get All  categ  \n<== end Log ==>\n");
		this.setCategs(categoryService.getAll());
		return "getAll";
	}
	
}
