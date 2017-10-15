package com;
import com.opensymphony.xwork2.ActionSupport;

public class UpdataAction extends ActionSupport {
	private String title;
	private String publisher;
	private java.util.Date publishdata;
	private int price;
	//private int isbn;
	private int isbn;
	private String author;
	private static final long serialVersionUID = 5L;
	public String execute()
	{
		PageDao pd=new PageDao();
		this.setAuthor(pd.findauthor(isbn));
		int i=pd.updata(title,publisher,publishdata,price,isbn);
		if (i>0)
		{
			return SUCCESS;
		}
		else
		{
			return INPUT;
		}	
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public java.util.Date getPublishdata() {
		return publishdata;
	}
	public void setPublishdata(java.util.Date publishdata) {
		this.publishdata = publishdata;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
}
