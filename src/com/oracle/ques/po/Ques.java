package com.oracle.ques.po;

import java.util.Date;

/**
 *	试题编号	ques_Id		NUMBER(8)
	试题内容	quesContent	VARCHAR2(200)
	试题答案	quesAnstwer	VARCHAR2(100)
	所属分类	quesType	NUMBER(8)
	创建人		Creator		NUMBER(8)
	创建时间	createDate	Date
	修改人		updater		NUMBER(8)
	修改时间	updateDate	Date

 * @author nbskycity
 *
 */
public class Ques {

	private int ques_Id;
	private String quesContent;
	private String quesAnstwer;
	private int quesType;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	public Ques() {};
	public Ques(int ques_Id, String quesContent, String quesAnstwer,
			int quesType, int creator, Date createDate, int updater,
			Date updateDate) {
		super();
		this.ques_Id = ques_Id;
		this.quesContent = quesContent;
		this.quesAnstwer = quesAnstwer;
		this.quesType = quesType;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}
	public int getQues_Id() {
		return ques_Id;
	}
	public void setQues_Id(int ques_Id) {
		this.ques_Id = ques_Id;
	}
	public String getQuesContent() {
		return quesContent;
	}
	public void setQuesContent(String quesContent) {
		this.quesContent = quesContent;
	}
	public String getQuesAnstwer() {
		return quesAnstwer;
	}
	public void setQuesAnstwer(String quesAnstwer) {
		this.quesAnstwer = quesAnstwer;
	}
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
		this.quesType = quesType;
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
	@Override
	public String toString() {
		return "Ques [ques_Id=" + ques_Id + ", quesContent=" + quesContent
				+ ", quesAnstwer=" + quesAnstwer + ", quesType=" + quesType
				+ ", creator=" + creator + ", createDate=" + createDate
				+ ", updater=" + updater + ", updateDate=" + updateDate + "]";
	}
	
	
}
