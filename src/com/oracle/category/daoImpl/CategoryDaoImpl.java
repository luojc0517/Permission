package com.oracle.category.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.category.dao.CategoryDao;
import com.oracle.category.po.Category;
import com.oracle.system.SystemUtil;

public class CategoryDaoImpl implements CategoryDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	@Override
	public boolean del(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(category);
		return true;
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_Category set categName=?,categContent=?,updater=?,updateDate=? where categ_Id=?")
		.setString(0, category.getCategName())
		.setString(1, category.getCategContent())
		.setInteger(2, SystemUtil.getThisUser().getUser_Id())
		.setDate(3,new Date())
		.setInteger(4, category.getCateg_Id()).executeUpdate();
		return true;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		Category category=(Category)sessionFactory.getCurrentSession().load(Category.class, id);
		return category;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		List<Category> categorys=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from Category");
		categorys=query.list();
		return categorys;
	}
	
	public boolean dels(int ids[]) {
		
		StringBuffer sql=new StringBuffer("delete T_Category where categ_Id=");
		for (int i=0;i<ids.length-1;i++) {
			sql.append(ids[i]+" or categ_Id=");
		}
		sql.append(ids[ids.length-1]);
		System.out.println(sql.toString());
		sessionFactory.getCurrentSession().createSQLQuery(sql.toString()).executeUpdate();
		return true;
	}
}
