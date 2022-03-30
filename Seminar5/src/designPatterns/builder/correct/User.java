package designPatterns.builder.correct;

public class User {
	
	//mandatory
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	
	//optional
	private String phoneNo;
	private String address;
	private String birthDate;

	
	public User (UserBuilder builder)
	{
		//mandatory
		this.username = builder.username;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		
		//optional
		this.address = builder.address;
		this.birthDate = builder.birthDate;
		this.phoneNo = builder.phoneNo;
	}	
	
	public static class UserBuilder {
		//---------------------------all the parameters from the builded class
		//mandatory
		private String username;
		private String firstName;
		private String lastName;
		private String email;
		
		//optional
		private String phoneNo;
		private String address;
		private String birthDate;
		
		//constructor with the mandatory part
		public UserBuilder(String username, String firstName, String lastName, String email) {
			this.username = username;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
		
		//setters for the optional part (it's a setter but we don't use the keyword and we don't make it void)
		public UserBuilder phoneNo(String phoneNo)
		{
			this.phoneNo = phoneNo;
			return this;
		}
		
		public UserBuilder address(String address)
		{
			this.address = address;
			return this;
		}
		
		public UserBuilder birthDate(String birthDate)
		{
			this.birthDate = birthDate;
			return this;
		}
		
		//the building method
		public User buildUser ()
		{
			User user = new User(this);
			return user;
		}
	}
}
