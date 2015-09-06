package com.oracle.news.service;

import java.util.List;

import com.oracle.news.po.News;

public interface NewsService {

	public boolean add(News news);

	public boolean del(News news);

	public boolean update(News news);

	public News get(int id);

	public List<News> getAll();
	
	public boolean dels(int ids[]) ;
}
