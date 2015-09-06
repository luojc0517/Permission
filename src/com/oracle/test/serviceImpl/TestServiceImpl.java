package com.oracle.test.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.test.dao.TestDao;
import com.oracle.test.po.Test;
import com.oracle.test.service.TestService;
import com.oracle.system.SystemUtil;

public class TestServiceImpl implements TestService {

	private TestDao testDao ;
	
	
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public int add(Test test) {
		// TODO Auto-generated method stub
		test.setGrade(0);
		test.setAnswer("-1");
		test.setCreator(SystemUtil.getThisUser().getUser_Id());
		test.setCreateDate(new Date());
		test.setUpdater(SystemUtil.getThisUser().getUser_Id());
		test.setUpdateDate(new Date());
		return testDao.add(test);
	}

	@Override
	public boolean del(Test test) {
		// TODO Auto-generated method stub
		return testDao.del(test);
	}
	
	public boolean update(Test test) {
		return testDao.update(test);
	}

	@Override
	public Test get(int id) {
		// TODO Auto-generated method stub
		return testDao.get(id);
	}

	@Override
	public List<Test> getAll() {
		// TODO Auto-generated method stub
		return testDao.getAll();
	}

}
