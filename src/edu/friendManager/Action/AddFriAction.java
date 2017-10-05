package edu.friendManager.Action;


import DBJavaBean.DB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import org.apache.struts2.interceptor.ServletRequestAware;
public class AddFriAction extends ActionSupport implements ServletRequestAware {
	private String newbookname;
	private String idbookinformation;
	private String ISBNnum;
	private String author;
	private String date;
	private String publisher;
	private String price;
	
	private ResultSet rs=null;
	private String message= "error";
	private HttpServletRequest request;
	private String userName =null;
	
	public String getName() {
		return newbookname;
	}
	
	public String getNumber() {
		return idbookinformation;
	}
	public void setNumber(String idbookinformation) {
		this.idbookinformation = idbookinformation;
	}
	public void setName(String newbookname) {
		this.newbookname = newbookname;
	}
	public String getISBN() {
		return ISBNnum;
	}
	public void setISBN(String ISBNnum) {
		this.ISBNnum = ISBNnum;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getpublisher() {
		return publisher;
	}
	public void setpublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
	
	public void setServletRequest(HttpServletRequest hsr)
	{
		request = hsr;
	}
	
	public void validate()
	{
		if(getName()== null || getName().length()==0)
		{
			addFieldError("newbookname","用户名不为空");
		}
		else{
			try{
				DB mysql = new DB();
				userName = mysql.returnLogin(request);
				rs = mysql.selectFri(request, userName, this.getName());
				if(rs.next())
				{
					addFieldError("name","已经存在");
					
				}
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		//if(getISBN()==null|| getISBN().length()==0)
			//addFieldError("","bunengweikong");
	}
	
	public String execute() throws Exception{
		DB mysql = new DB();
		userName = mysql.returnLogin(request);
		String fri = mysql.insertFri(request, userName, this.getName(), this.getprice(), this.getdate(), this.getauthor(), this.getpublisher(), this.getISBN(),this.getNumber());
		if(fri.equals("ok"))
		{
			message = SUCCESS;
		}
		else if(fri.equals("one"))
		{
			message = INPUT;
			
		}
		return message;
	}
	
	
	
}
