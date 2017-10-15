 package com;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class PageAction extends ActionSupport {
	private int pageNumber=-1;
	private int totalPage;
	private int pageSize;
	private String author;
	private List<Book> allbooks;
	private static final long serialVersionUID = 2L;
	public String execute()
	{
		PageDao pd=new PageDao();
		pageSize=6;
		int bookAmount=pd.getbooksamount(author);
		//this.totalPage=bookAmount%pageSize==0?(bookAmount/pageSize):(bookAmount/pageSize+1);
		totalPage=1;
		/*if (pageNumber<0)
		{
			pageNumber=1;
		}
		if (pageNumber>totalPage)
		{
			pageNumber=totalPage;
		}*/
		//this.setAllbooks(pd.allbooks(pageNumber, pageSize,author));
		this.setAllbooks(pd.allbooks(1, bookAmount,author));
		return SUCCESS;
	}
	public void validate()
	{
		if (author==null)
		{
			this.addFieldError(author, "author can't be null");
		}
		else if ((!author.equals("mary"))&&(!author.equals("peter"))&&(!author.equals("tom"))&&(!author.equals("lily")))
		{
			this.addFieldError(author, "there isn't "+author);
		}
	}
	public List<Book> getAllbooks() {
		return allbooks;
	}

	public void setAllbooks(List<Book> allbooks) {
		this.allbooks = allbooks;
	}

	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
