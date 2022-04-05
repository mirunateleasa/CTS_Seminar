package src.designPatterns.builder;

public class Main {

	public static void main(String[] args) {
		//mandatory
		User user1 = new User.UserBuilder("miruna123", "1234", "miruna@gmail").build();
		
		//optional
		User user2 = new User.UserBuilder("miruna1234", "123", "miruna@yahoo").address("bucharest").build();
	}

}
