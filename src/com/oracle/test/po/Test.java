package com.oracle.test.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.oracle.ques.po.Ques;

/**
 *	试卷编号	test_Id		NUMBER(8)
	试题类型	quesType	NUMBER(8)
	试卷成绩	grade		NUMBER(8)
	答题情况	answer		VARCHAR2(20)
	所属用户	Creator		NUMBER(8)
	创建时间	createDate	Date
	修改人		Updater		NUMBER(8)
	修改时间	updateDate	Date



 * @author nbskycity
 *
 */
public class Test {

	private int test_Id;
	private int quesType;
	private int grade;
	private String answer;				//存放用户答题情况，1表示正确，0表示错误
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	private List<Ques> quess=new ArrayList<Ques>();

	
	public Test() {}
	public Test(int test_Id, int quesType, int grade, String answer,
			int creator, Date createDate, int updater, Date updateDate,
			List<Ques> quess) {
		super();
		this.test_Id = test_Id;
		this.quesType = quesType;
		this.grade = grade;
		this.answer = answer;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
		this.quess = quess;
	}
	public int getTest_Id() {
		return test_Id;
	}
	public void setTest_Id(int test_Id) {
		this.test_Id = test_Id;
	}
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
		this.quesType = quesType;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getCreator() {
		return creator;
	}
	public void setCreator(int creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getUpdater() {
		return updater;
	}
	public void setUpdater(int updater) {
		this.updater = updater;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public List<Ques> getQuess() {
		return quess;
	}
	public void setQuess(List<Ques> quess) {
		this.quess = quess;
	}
	@Override
	public String toString() {
		return "Test [test_Id=" + test_Id + ", quesType=" + quesType
				+ ", grade=" + grade + ", answer=" + answer + ", creator="
				+ creator + ", createDate=" + createDate + ", updater="
				+ updater + ", updateDate=" + updateDate + ", quess=" + quess
				+ "]";
	}
	
	
}
