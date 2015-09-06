package com.oracle.category.po;

import java.util.Date;


/**
	栏目编号	categ_Id		NUMBER(8)
	栏目名称	categName		VARCHAR2(20)
	栏目描述	categContent	VARCHAR2(100)
	创建人		creator			NUMBER(8)
	创建时间	createDate		Date
	修改人		updater			NUMBER(8)
	修改时间	updateDate		Date


 * @author nbskycity
 *
 */
public class Category {

	private int categ_Id;
	private String categName;
	private String categContent;;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	public Category() {}

	public Category(int categ_Id, String categName, String categContent,
			int creator, Date createDate, int updater, Date updateDate) {
		super();
		this.categ_Id = categ_Id;
		this.categName = categName;
		this.categContent = categContent;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}

	public int getCateg_Id() {
		return categ_Id;
	}

	public void setCateg_Id(int categ_Id) {
		this.categ_Id = categ_Id;
	}

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public String getCategContent() {
		return categContent;
	}

	public void setCategContent(String categContent) {
		this.categContent = categContent;
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
		return "Category [categ_Id=" + categ_Id + ", categName=" + categName
				+ ", categContent=" + categContent + ", creator=" + creator
				+ ", createDate=" + createDate + ", updater=" + updater
				+ ", updateDate=" + updateDate + "]";
	}
	
}
