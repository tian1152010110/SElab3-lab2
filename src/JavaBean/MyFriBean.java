package JavaBean;

public class MyFriBean {
//	private String BookName;
//	private Integer idbookinformation;
//	private String ISBN;
//	private String publisher;
//	private String date;
//	private String price;
//	private String authorid;
	
	private String newbookname;
	private String idbookinformation;
	private String ISBNnum;
	private String author;
	private String date;
	private String publisher;
	private String price;
	
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
}
