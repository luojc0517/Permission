package com.oracle.ques.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.oracle.ques.dao.QuesDao;
import com.oracle.ques.po.Ques;
import com.oracle.ques.service.QuesService;
import com.oracle.system.SystemUtil;

public class QuesServiceImpl implements QuesService {

	private QuesDao quesDao ;
	
	public void setQuesDao(QuesDao quesDao) {
		this.quesDao = quesDao;
	}

	@Override
	public boolean add(Ques ques) {
		// TODO Auto-generated method stub
		ques.setQuesType(0);
		ques.setCreator(SystemUtil.getThisUser().getUser_Id());
		ques.setCreateDate(new Date());
		ques.setUpdater(SystemUtil.getThisUser().getUser_Id());
		ques.setUpdateDate(new Date());
		return quesDao.add(ques);
	}

	@Override
	public boolean del(Ques ques) {
		// TODO Auto-generated method stub
		return quesDao.del(ques);
	}

	@Override
	public boolean update(Ques ques) {
		// TODO Auto-generated method stub
		return quesDao.update(ques);
	}

	@Override
	public Ques get(int id) {
		// TODO Auto-generated method stub
		return quesDao.get(id);
	}

	@Override
	public List<Ques> getATest(Set<Integer> args) {
		// TODO Auto-generated method stub
		return quesDao.getATest(args);
	}
	
	public Integer getCount() {
		return quesDao.getCount();
	}

}
