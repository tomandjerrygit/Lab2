package com;

import java.util.*;
import com.opensymphony.xwork2.*;

public class AllBooksAction extends ActionSupport{
	private int pageNumber;
	private int pageSize;
	private int totalPage;
	private List<Book> allbooks;
	private static final long serialVersionUID = 3L;
	private String author;
	//private int authorid;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String execute()
	{
		PageDao pd=new PageDao();
		allbooks=pd.allbooks(pageNumber, pageSize,author);
		return SUCCESS;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Book> getAllbooks() {
		return allbooks;
	}
	public void setAllbooks(List<Book> allbooks) {
		this.allbooks = allbooks;
	}
}
