package JavaBean;

public class UserNameBean {
		private String userName;
		private String password;
		public UserNameBean(){
			
		}
		public String getUserName()
		{
			return userName;
		}
		public void detUserName(String userName)
		{
			this.userName = userName;
		}
		public String getPassword(){
			return password;
			
		}
		public void setPassword(String password)
		{
			this.password = password;
		}
}
