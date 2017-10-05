package JavaBean;


public class MyDayBean {
	private String authorname;
	private String authornumber;
	private String authorid;
	private String authorage;
	private String authorcountry;
	
	public String getName() {
		return authorname;
	}
	
	public String getNumber() {
		return authornumber;
	}
	public void setNumber(String authornumber) {
		this.authornumber = authornumber;
	}
	public void setName(String authorname) {
		this.authorname = authorname;
	}
	public String getid() {
		return authorid;
	}
	public void setauthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getauthorage() {
		return authorage;
	}
	public void setauthorage(String authorage) {
		this.authorage = authorage;
	}
	public String getcountry() {
		return authorcountry;
	}
	public void setcountry(String authorcountry) {
		this.authorcountry = authorcountry;
	}
	
}
