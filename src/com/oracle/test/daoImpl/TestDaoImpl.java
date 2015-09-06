package com.oracle.test.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.system.SystemUtil;
import com.oracle.test.dao.TestDao;
import com.oracle.test.po.Test;

public class TestDaoImpl implements TestDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int add(Test test) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(test);
		return test.getTest_Id();
	}

	@Override
	public boolean del(Test test) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(test);
		return true;
	}

	@Override
	public boolean update(Test test) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_Test set quesType=?,grade=?,answer=?,updater=?,updateDate=? where test_Id=?")
		.setInteger(0, test.getQuesType())
		.setInteger(1, test.getGrade())
		.setString(2, test.getAnswer())
		.setInteger(3, SystemUtil.getThisUser().getUser_Id())
		.setDate(4,new Date())
		.setInteger(5, test.getTest_Id()).executeUpdate();
		return true;
	}

	@Override
	public Test get(int id) {
		// TODO Auto-generated method stub
		Test test=(Test)sessionFactory.getCurrentSession().load(Test.class, id);
		return test;
	}

	@Override
	public List<Test> getAll() {
		// TODO Auto-generated method stub
		List<Test> tests=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from Test");
		tests=query.list();
		return tests;
	}
	

}
