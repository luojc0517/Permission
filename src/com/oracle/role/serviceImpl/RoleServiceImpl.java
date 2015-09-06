package com.oracle.role.serviceImpl;

import java.util.Date;
import java.util.List;

import com.oracle.role.dao.RoleDao;
import com.oracle.role.po.Role;
import com.oracle.role.service.RoleService;
import com.oracle.system.SystemUtil;


public class RoleServiceImpl implements RoleService {

	private RoleDao roleDao ;
	
	
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public boolean add(Role role) {
		// TODO Auto-generated method stub
		role.setCreator(SystemUtil.getThisUser().getUser_Id());
		role.setCreateDate(new Date());
		role.setUpdater(SystemUtil.getThisUser().getUser_Id());
		role.setUpdateDate(new Date());
		return roleDao.add(role);
	}

	@Override
	public boolean del(Role role) {
		// TODO Auto-generated method stub
		return roleDao.del(role);
	}

	@Override
	public boolean update(Role role) {
		// TODO Auto-generated method stub
		return roleDao.update(role);
	}

	@Override
	public Role get(int id) {
		// TODO Auto-generated method stub
		return roleDao.get(id);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return roleDao.getAll();
	}

	public boolean addAuth(Role role) {
		return roleDao.addAuth(role);
	}
}
