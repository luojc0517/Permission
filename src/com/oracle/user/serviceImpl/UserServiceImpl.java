package com.oracle.user.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.system.SystemUtil;
import com.oracle.user.dao.UserDao;
import com.oracle.user.po.User;
import com.oracle.user.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao ;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		user.setCreator(SystemUtil.getThisUser().getUser_Id());
		user.setCreateDate(new Date());
		user.setUpdater(SystemUtil.getThisUser().getUser_Id());
		user.setUpdateDate(new Date());
		user.setUserState("否");
		return userDao.add(user);
	}

	@Override
	public boolean del(User user) {
		// TODO Auto-generated method stub
		return userDao.del(user);
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
	
	public User login(User user) {
		return userDao.login(user);
	}

	public boolean addAuth(User user) {
		return userDao.addAuth(user);
	}
}
