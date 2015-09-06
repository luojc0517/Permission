package com.oracle.news.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.news.dao.NewsDao;
import com.oracle.news.po.News;
import com.oracle.system.SystemUtil;

public class NewsDaoImpl implements NewsDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(News news) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(news);
		return true;
	}

	@Override
	public boolean del(News news) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(news);
		return true;
	}

	@Override
	public boolean update(News news) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_News set newsTitle=?,category=?,newsContent=?,updater=?,updateDate=? where news_Id=?")
		.setString(0, news.getNewsTitle())
		.setInteger(1, news.getCategory())
		.setString(2, news.getNewsContent())
		.setInteger(3, SystemUtil.getThisUser().getUser_Id())
		.setDate(4,new Date())
		.setInteger(5, news.getNews_Id()).executeUpdate();
		return true;
	}

	@Override
	public News get(int id) {
		// TODO Auto-generated method stub
		News news=(News)sessionFactory.getCurrentSession().load(News.class, id);
		return news;
	}

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		List<News> newss=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from News");
		newss=query.list();
		return newss;
	}
	
	public boolean dels(int ids[]) {
		
		StringBuffer sql=new StringBuffer("delete T_News where news_Id=");
		for (int i=0;i<ids.length-1;i++) {
			sql.append(ids[i]+" or news_Id=");
		}
		sql.append(ids[ids.length-1]);
		System.out.println(sql.toString());
		sessionFactory.getCurrentSession().createSQLQuery(sql.toString()).executeUpdate();
		return true;
	}
}
