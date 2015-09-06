package com.oracle.test.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.oracle.ques.po.Ques;
import com.oracle.ques.service.QuesService;
import com.oracle.ques.vo.TestQues;
import com.oracle.test.po.Test;
import com.oracle.test.service.TestService;

public class TestAction {

	private Integer id;
	private TestService testService;
	private Test test;
	private String anstwers[];
	private String ss;
	private QuesService quesService;

	public void setQuesService(QuesService quesService) {
		this.quesService = quesService;
	}
	public String getSs() {
		return ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public String[] getAnstwers() {
		return anstwers;
	}
	public void setAnstwers(String[] anstwers) {
		this.anstwers = anstwers;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public void add(Test test) {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> add a test "+test.toString()+" \n<== end Log ==>\n");
		testService.add(test);
		return ;
	}
	
	public void saveJson(List<Ques> qs) {
		List<TestQues> quess=new ArrayList<TestQues>();
		for(int i=0;i<qs.size();i++) {
			quess.add(new TestQues(id,qs.get(i).getQuesContent()));
		}
		JSONArray ja = new JSONArray();
		for (TestQues c : quess) {
			ja.add(c);
		}
		try {
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			ServletActionContext.getResponse().getWriter().print(ja);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ;
	}
	
	
	//取得一张试卷
		public void getATest() {
			System.out.println("\n<== Log ==>\n "+new Date()+"==> get a test ... \n<== end Log ==>\n");
			
			Set<Integer> numbers=new HashSet<Integer>();
			int count=quesService.getCount();
			for(int i=0;numbers.size()<10;i++) {
				numbers.add(new Random().nextInt(count)+1);
			}
			List<Ques> qs=quesService.getATest(numbers);
			
			//根据随机题目创建一张试卷
			Test test=new Test();
			test.setQuess(qs);
			test.setQuesType(qs.get(0).getQuesType());
			id=testService.add(test);
			
			this.saveJson(qs);
		}
	//jQuery取得成绩
	public void getGrade() {
		String str=null;
		try {
			str=new String(anstwers[0].getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(str);
		String []ans=str.split(",");
		Test t=testService.get(id);
		List<Ques> qs=t.getQuess();
		System.out.println("qs.length ===="+qs.size());
		int grade=0;
		Iterator<Ques> it=qs.iterator();
		
		String html="";
		String anster="";
		for(int i =0 ;it.hasNext(); i++) {
			Ques q=it.next();
			if(q.getQuesAnstwer().equals(ans[i])) {
				grade+=10;
				anster+="1,";
			} else {
				html=html+"<h4> 错题："+(i+1)+"</h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+q.getQuesContent()+"<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;你的答案：<span class='error' >"+ans[i]+"</span><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;正确答案：<span class='true' >"+q.getQuesAnstwer()+"</span>";
				anster+="0,";
			}
		}
		System.out.println("====="+anster);
		anster=anster.substring(0, anster.length()-1);
		System.out.println("====="+anster);
//		this.setSs("您的成绩 ： "+grade);
		String ss="您的成绩 ： "+grade;
		
		//更新试卷成绩及答题情况
		t.setGrade(grade);
		t.setAnswer(anster);
		testService.update(t);
		
		//将成绩返回到页面
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().print(ss+html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return "getGrade";
	}
	
	
	//得到错题
	public void getErrorQues() {
		Test t=testService.get(id);
		List<Ques> qs=t.getQuess();
		String anster=t.getAnswer();
		String ans[]=anster.split(",");
		List<Ques> qss=new ArrayList<Ques>();
		
		for(int i=0;i<ans.length;i++) {
			if(ans[i].equals("0")) {
				qss.add(qs.get(i));
			}
		}
		this.saveJson(qss);
	}
	
	
	
	
	
	
	
	
	
	
	//更新成绩
	public String update() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> get a test, id="+id+" \n<== end Log ==>\n");
		testService.update(test);
		return "get";
	}
	//根据用户Id 清空该用户已做题目
	public String del() {
		System.out.println("\n<== Log ==>\n "+new Date()+"==> del test, id= "+id+" \n<== end Log ==>\n");
		Test a=testService.get(id);
		testService.del(a);
		return "add";
	}
	
	public List<Test> getAllTest() {
		return testService.getAll();
	}
	
	
}
