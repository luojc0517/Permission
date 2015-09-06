package com.oracle.user.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.system.SystemUtil;
import com.oracle.user.dao.UserDao;
import com.oracle.user.po.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

	@Override
	public boolean del(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_User set userName=?,password=?,userTrueName=?,userState=?,updater=?,updateDate=? where user_Id=?")
		.setString(0, user.getUserName())
		.setString(1, user.getPassword())
		.setString(2, user.getUserTrueName())
		.setString(3, user.getUserState())
		.setInteger(4, SystemUtil.getThisUser().getUser_Id())
		.setDate(5,new Date())
		.setInteger(6, user.getUser_Id()).executeUpdate();
		return true;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		User user=(User)sessionFactory.getCurrentSession().load(User.class, id);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> users=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from User");
		users=query.list();
		return users;
	}
	
	public User login(User user) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User where userName=? and password=? and userState='是'")
				.setString(0, user.getUserName())
				.setString(1, user.getPassword())
				.uniqueResult() ;
			
	}

	public boolean addAuth(User user) {
		sessionFactory.getCurrentSession().update(user);
		return true;
	}
}
