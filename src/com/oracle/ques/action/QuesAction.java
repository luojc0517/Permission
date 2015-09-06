package com.oracle.ques.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import com.oracle.ques.po.Ques;
import com.oracle.ques.service.QuesService;
import com.oracle.ques.vo.PageQues;
import com.oracle.ques.vo.TestQues;

public class QuesAction {

	
	private PageQues ques;
	private int id;
	private QuesService quesService;
	private List<TestQues> quess=new ArrayList<TestQues>();

	public PageQues getQues() {
		return ques;
	}
	public void setQues(PageQues ques) {
		this.ques = ques;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<TestQues> getQuess() {
		return quess;
	}
	public void setQuess(List<TestQues> quess) {
		this.quess = quess;
	}
	public void setQuesService(QuesService quesService) {
		this.quesService = quesService;
	}
	
	
	public String add() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> add a question "+ques.toString()+" \n<== end Log ==>\n");
		Ques q=new Ques(ques.getQues_Id(),ques.getQuesContent(),ques.getQuesAnstwer(),ques.getQuesType(),0,null,0,null);
		quesService.add(q);
		return "add";
	}
	
	
	
	
	
	
	
	
	//根据ques_Id 取得单个 Ques
	public String get() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> get a question, id="+id+" \n<== end Log ==>\n");
		Ques q=quesService.get(id);
		ques=new PageQues(q.getQues_Id(),q.getQuesContent(),q.getQuesAnstwer(),q.getQuesType());
//		this.setPageQues(ques);
		return "get";
	}
	//修改ques操作
	public String update() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> update auth "+ques.toString()+" \n<== end Log ==>\n");
		Ques q=new Ques(ques.getQues_Id(),ques.getQuesContent(),ques.getQuesAnstwer(),ques.getQuesType(),0,null,0,null);
		quesService.update(q);
		return "add";
	}
	//删除ques操作
	public String del() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> del auth, id= "+id+" \n<== end Log ==>\n");
		Ques a=quesService.get(id);
		quesService.del(a);
		return "add";
	}
	

	
}
