package com;

import com.opensymphony.xwork2.ActionSupport;

public class ShowthebookAction extends ActionSupport {
	private String bookname;
	private Book thebook;
	//private List<Book> allbooks;
	private static final long serialVersionUID = 4L;
	public String execute()
	{
		PageDao pd=new PageDao();
		this.setThebook(pd.findbook(bookname));
		return SUCCESS;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Book getThebook() {
		return thebook;
	}
	public void setThebook(Book thebook) {
		this.thebook = thebook;
	}
}

