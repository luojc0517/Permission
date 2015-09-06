package com.oracle.news.po;

import java.util.Date;

/**
	新闻编号	news_Id		NUMBER(8)
	新闻标题	newsTitle	VARCHAR2(20)
	所属栏目	category	NUMBER(8)
	新闻内容	newsContent	VARCHAR2(200)
	创建人		creator		NUMBER(8)
	创建时间	createDate	Date
	修改人		updater		NUMBER(8)
	修改时间	updateDate	Date


 * @author nbskycity
 *
 */
public class News {

	private int news_Id;
	private String newsTitle;
	private int category;
	private String newsContent;
	private int creator;
	private Date createDate;
	private int updater;
	private Date updateDate;
	
	public News() {}

	public News(int news_Id, String newsTitle, int category,
			String newsContent, int creator, Date createDate, int updater,
			Date updateDate) {
		super();
		this.news_Id = news_Id;
		this.newsTitle = newsTitle;
		this.category = category;
		this.newsContent = newsContent;
		this.creator = creator;
		this.createDate = createDate;
		this.updater = updater;
		this.updateDate = updateDate;
	}

	public int getNews_Id() {
		return news_Id;
	}

	public void setNews_Id(int news_Id) {
		this.news_Id = news_Id;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
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
		return "News [news_Id=" + news_Id + ", newsTitle=" + newsTitle
				+ ", category=" + category + ", newsContent=" + newsContent
				+ ", creator=" + creator + ", createDate=" + createDate
				+ ", updater=" + updater + ", updateDate=" + updateDate + "]";
	}

	
}
