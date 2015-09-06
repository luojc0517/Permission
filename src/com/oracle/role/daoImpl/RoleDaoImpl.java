package com.oracle.role.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.role.dao.RoleDao;
import com.oracle.role.po.Role;
import com.oracle.system.SystemUtil;
import com.oracle.user.po.User;

public class RoleDaoImpl implements RoleDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(Role role) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(role);
		return true;
	}

	@Override
	public boolean del(Role role) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(role);
		return true;
	}

	@Override
	public boolean update(Role role) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_Role set roleName=?,roleContent=?,updater=?,updateDate=? where role_Id=?")
		.setString(0, role.getRoleName())
		.setString(1, role.getRoleContent())
		.setInteger(2, SystemUtil.getThisUser().getUser_Id())
		.setDate(3,new Date())
		.setInteger(4, role.getRole_Id()).executeUpdate();
		return true;
	}

	@Override
	public Role get(int id) {
		// TODO Auto-generated method stub
		Role role=(Role)sessionFactory.getCurrentSession().load(Role.class, id);
		return role;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		List<Role> users=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from Role");
		users=query.list();
		return users;
	}
	
	public boolean addAuth(Role role) {
		sessionFactory.getCurrentSession().update(role);
		return true;
	}
}
