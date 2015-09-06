package com.oracle.ques.daoImpl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.oracle.ques.dao.QuesDao;
import com.oracle.ques.po.Ques;
import com.oracle.system.SystemUtil;

public class QuesDaoImpl implements QuesDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean add(Ques ques) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(ques);
		return true;
	}

	@Override
	public boolean del(Ques ques) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(ques);
		return true;
	}

	@Override
	public boolean update(Ques ques) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("update T_Ques set quesContent=?,quesAnstwer=?,quesType=?,updater=?,updateDate=? where ques_Id=?")
		.setString(0, ques.getQuesContent())
		.setString(1, ques.getQuesAnstwer())
		.setInteger(2, ques.getQuesType())
		.setInteger(3, SystemUtil.getThisUser().getUser_Id())
		.setDate(4,new Date())
		.setInteger(5, ques.getQues_Id()).executeUpdate();
		return true;
	}

	@Override
	public Ques get(int id) {
		// TODO Auto-generated method stub
		Ques ques=(Ques)sessionFactory.getCurrentSession().load(Ques.class, id);
		return ques;
	}

	@Override
	public List<Ques> getATest(Set<Integer> args) {
		// TODO Auto-generated method stub
		StringBuffer sql=new StringBuffer("from Ques where ques_Id=");
		Iterator<Integer> it=args.iterator();
		for(int i=0;it.hasNext();i++) {
			sql.append(it.next()+" or ques_Id=");
		}
		String s=sql.substring(0, sql.length()-11);
		List<Ques> quess=null;
//		Query query=sessionFactory.getCurrentSession().createQuery(s);
//		Query query=sessionFactory.getCurrentSession().createQuery("from Ques q where q.id in (:ids)") 
//				.setParameterList("ids",args);

		Query query=sessionFactory.getCurrentSession().createQuery(s);
		
		quess=query.list();
//		System.out.println("========="+query.list().size()+"========");
//		System.out.println("========="+quess.size()+"========");
//		System.out.println("========="+quess.get(0).getQuesContent()+"========");
		
		return quess;
	}
	
	public Integer getCount() {
		return sessionFactory.getCurrentSession().createQuery("from Ques").list().size();
	}

}
