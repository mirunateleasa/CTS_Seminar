package src.designPatterns.builder;

public class User {
		//mandatory 
	String username;
	String password;
	String email;
	
		//optional
	String address;
	String phoneNo;
	String birthDay;
	
	public User(UserBuilder userBuilder) {
		super();
		this.username = userBuilder.username;
		this.password = userBuilder.password;
		this.email = userBuilder.email;
		this.address = userBuilder.address;
		this.phoneNo = userBuilder.phoneNo;
		this.birthDay = userBuilder.birthDay;
	}
	
	public static class UserBuilder {
			//mandatory 
		String username;
		String password;
		String email;
		
			//optional
		String address;
		String phoneNo;
		String birthDay;
		
		UserBuilder (String username, String password, String email)
		{
			this.username = username;
			this.password = password;
			this.email = email;
		}
		
		UserBuilder address (String address)
		{
			this.address = address;
			return this;
		}
		
		UserBuilder phoneNo (String phoneNo)
		{
			this.phoneNo = phoneNo;
			return this;
		}
		
		UserBuilder birthDay (String birthDay)
		{
			this.birthDay = birthDay;
			return this;
		}
		
		public User build ()
		{
			User user = new User(this);
			return user;
		}
	
	}
}
