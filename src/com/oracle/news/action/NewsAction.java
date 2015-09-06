package com.oracle.news.action;

import java.util.Date;
import java.util.List;

import com.oracle.category.po.Category;
import com.oracle.category.service.CategoryService;
import com.oracle.news.po.News;
import com.oracle.news.service.NewsService;

public class NewsAction {

	private News news;
	private int id;
	private List<News> newss;
	private List<Category> categs;
	private NewsService newsService;
	private CategoryService cs;
	private int selectid[];

	public int[] getSelectid() {
		return selectid;
	}

	public void setSelectid(int[] selectid) {
		this.selectid = selectid;
	}

	public void setCs(CategoryService cs) {
		this.cs = cs;
	}

	public List<Category> getCategs() {
		return categs;
	}

	public void setCategs(List<Category> categs) {
		this.categs = categs;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<News> getNewss() {
		return newss;
	}

	public void setNewss(List<News> newss) {
		this.newss = newss;
	}

	public String add() {
		System.out.println("\n<== Log ==>\n " + new Date() + "==> add a news "
				+ news.toString() + " \n<== end Log ==>\n");
		newsService.add(news);
		return "add";
	}

	public String update() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> update a news " + news.toString()
				+ " \n<== end Log ==>\n");
		newsService.update(news);
		return "add";
	}

	public String get() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> get a news , id = " + id + " \n<== end Log ==>\n");
		this.setNews(newsService.get(id));
		this.setCategs(cs.getAll());
		return "get";
	}

	public String del() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> del a news , id = " + id + " \n<== end Log ==>\n");
		newsService.del((newsService.get(id)));
		return "add";
	}

	public String dels() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> del some categ , id = " + selectid[0] + " and id = "
				+ selectid[1] + " \n<== end Log ==>\n");
		newsService.dels(selectid);
		return "add";
	}

	public String loginCateg() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> login get All category  \n<== end Log ==>\n");
		if(cs.getAll()!=null)System.out.println("not null");
		this.setCategs(cs.getAll());
		return "input";
	}

	public String getAll() {
		System.out.println("\n<== Log ==>\n " + new Date()
				+ "==> get All  news  \n<== end Log ==>\n");
		this.setNewss(newsService.getAll());
		return "getAll";
	}
}
