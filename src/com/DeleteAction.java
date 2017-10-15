package com;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {
	private int isbn;
	private String author;
	private static final long serialVersionUID = 2L;
	public String execute()
	{
		PageDao pd=new PageDao();
		this.setAuthor(pd.findauthor(isbn));
		int i=pd.deletebook(isbn);		
		if (i>0)
		{
			return SUCCESS;
		}
		else
		{
			return INPUT;
		}		
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
