package com.oracle.quesType.po;

import java.util.Date;

/**
 *	试题类型编号	quesType_Id		NUMBER(8)
	试题类型名	quesTypeName	VARCHAR2(20)
	创建人		Creator			NUMBER(8)
	创建时间	createDate		Date
	修改人		Updater			NUMBER(8)
	修改时间	updateDate		Date


 * @author nbskycity
 *
 */
public class QuesType {

	private int quesType_Id;
	private String quesTypeName;
	private int crator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	public QuesType(int quesType_Id, String quesTypeName, int crator,
			Date createDate, int updater, Date updateDate) {
		super();
		this.quesType_Id = quesType_Id;
		this.quesTypeName = quesTypeName;
		this.crator = crator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}
	public int getQuesType_Id() {
		return quesType_Id;
	}
	public void setQuesType_Id(int quesType_Id) {
		this.quesType_Id = quesType_Id;
	}
	public String getQuesTypeName() {
		return quesTypeName;
	}
	public void setQuesTypeName(String quesTypeName) {
		this.quesTypeName = quesTypeName;
	}
	public int getCrator() {
		return crator;
	}
	public void setCrator(int crator) {
		this.crator = crator;
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
		return "QuesType [quesType_Id=" + quesType_Id + ", quesTypeName="
				+ quesTypeName + ", crator=" + crator + ", createDate="
				+ createDate + ", updater=" + updater + ", updateDate="
				+ updateDate + "]";
	}
	
	
}
