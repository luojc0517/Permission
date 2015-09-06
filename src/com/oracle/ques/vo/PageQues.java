package com.oracle.ques.vo;

public class PageQues {
	
	private int ques_Id;
	private String quesContent;
	private String quesAnstwer;
	private int quesType;
	
	public PageQues() {};
	public PageQues(int ques_Id, String quesContent, String quesAnstwer,
			int quesType) {
		super();
		this.ques_Id = ques_Id;
		this.quesContent = quesContent;
		this.quesAnstwer = quesAnstwer;
		this.quesType = quesType;
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
	@Override
	public String toString() {
		return "PageQues [ques_Id=" + ques_Id + ", quesContent=" + quesContent
				+ ", quesAnstwer=" + quesAnstwer + ", quesType=" + quesType
				+ "]";
	}
	
	
}
