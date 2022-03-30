package designPatterns.builder.wrong;

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
	
	public User (String username, String firstName, String lastName, String email)
	{
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public User (String username, String firstName, String lastName, String email, String phoneNo)
	{
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
//	public User (String username, String firstName, String lastName, String email, String address)
//	{
//		this.username = username;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.address = address;
//	}
	
	//this is not going to work because:
	// - you're going to have many useless constructors
	// - the constructors will have the same signature and it will throw an error
}
