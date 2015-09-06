package com.oracle.news.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.news.dao.NewsDao;
import com.oracle.news.po.News;
import com.oracle.news.service.NewsService;
import com.oracle.system.SystemUtil;

public class NewsServiceImpl implements NewsService {

	private NewsDao newsDao ;
	
	
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	@Override
	public boolean add(News news) {
		// TODO Auto-generated method stub
		news.setCreator(SystemUtil.getThisUser().getUser_Id());
		news.setCreateDate(new Date());
		news.setUpdater(SystemUtil.getThisUser().getUser_Id());
		news.setUpdateDate(new Date());
		return newsDao.add(news);
	}

	@Override
	public boolean del(News news) {
		// TODO Auto-generated method stub
		return newsDao.del(news);
	}

	@Override
	public boolean update(News news) {
		// TODO Auto-generated method stub
		return newsDao.update(news);
	}

	@Override
	public News get(int id) {
		// TODO Auto-generated method stub
		return newsDao.get(id);
	}

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		return newsDao.getAll();
	}

	public boolean dels(int ids[]) {
		return newsDao.dels(ids);
	}

}
