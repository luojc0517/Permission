package com.oracle.ques.vo;

public class TestQues {

	private int testId;
	private String quesContent;
	
	public TestQues() {}

	public TestQues(int testId, String quesContent) {
		super();
		this.testId = testId;
		this.quesContent = quesContent;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getQuesContent() {
		return quesContent;
	}

	public void setQuesContent(String quesContent) {
		this.quesContent = quesContent;
	}

	@Override
	public String toString() {
		return "TestQues [testId=" + testId + ", quesContent=" + quesContent
				+ "]";
	};
	
	
}
