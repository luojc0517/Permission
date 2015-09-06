package com.oracle.quesType.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.auth.dao.AuthDao;
import com.oracle.auth.po.Auth;
import com.oracle.auth.service.AuthService;
import com.oracle.system.SystemUtil;

public class QuesServiceImpl implements AuthService {

	private AuthDao authDao ;
	
	
	public void setAuthDao(AuthDao authDao) {
		this.authDao = authDao;
	}

	@Override
	public boolean add(Auth auth) {
		// TODO Auto-generated method stub
		auth.setCreator(SystemUtil.getThisUser().getUser_Id());
		auth.setCreateDate(new Date());
		auth.setUpdater(SystemUtil.getThisUser().getUser_Id());
		auth.setUpdateDate(new Date());
		return authDao.add(auth);
	}

	@Override
	public boolean del(Auth auth) {
		// TODO Auto-generated method stub
		return authDao.del(auth);
	}

	@Override
	public boolean update(Auth auth) {
		// TODO Auto-generated method stub
		return authDao.update(auth);
	}

	@Override
	public Auth get(int id) {
		// TODO Auto-generated method stub
		return authDao.get(id);
	}

	@Override
	public List<Auth> getAll() {
		// TODO Auto-generated method stub
		return authDao.getAll();
	}

}
