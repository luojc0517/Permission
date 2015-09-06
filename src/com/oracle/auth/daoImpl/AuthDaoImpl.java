package com.oracle.auth.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.auth.dao.AuthDao;
import com.oracle.auth.po.Auth;
import com.oracle.system.SystemUtil;

public class AuthDaoImpl implements AuthDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(Auth auth) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(auth);
		return true;
	}

	@Override
	public boolean del(Auth auth) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(auth);
		return true;
	}

	@Override
	public boolean update(Auth auth) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_Auth set authName=?,authUrl=?,authParentRoot=?,authIsRoot=?,updater=?,updateDate=? where auth_Id=?")
		.setString(0, auth.getAuthName())
		.setString(1, auth.getAuthUrl())
		.setInteger(2, auth.getAuthParentRoot())
		.setString(3, auth.getAuthIsRoot())
		.setInteger(4, SystemUtil.getThisUser().getUser_Id())
		.setDate(5,new Date())
		.setInteger(6, auth.getAuth_Id()).executeUpdate();
		return true;
	}

	@Override
	public Auth get(int id) {
		// TODO Auto-generated method stub
		Auth auth=(Auth)sessionFactory.getCurrentSession().load(Auth.class, id);
		return auth;
	}

	@Override
	public List<Auth> getAll() {
		// TODO Auto-generated method stub
		List<Auth> users=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from Auth");
		users=query.list();
		return users;
	}
	

}
