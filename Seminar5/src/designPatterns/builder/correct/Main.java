package designPatterns.builder.correct;

import designPatterns.builder.correct.User;

public class Main {

	public static void main(String[] args) {
		
			//for the wrong thing
			//User user1 = new User ("madalina@csie.ro", "madalina", "pana", "madalina@csie.ro", "bucharest");
			//User user2 = new User ("madalina@csie.ro", "madalina", "pana", "madalina@csie.ro", "0723455565");
			
			//for the correct thing
			User user1 = new User.UserBuilder("madalina@csie.ro", "madalina", "pana", "madalina@csie.ro").buildUser();
			User user2 = new User.UserBuilder("madalina@csie.ro", "madalina", "pana", "madalina@csie.ro").address("bucharest").buildUser();
	}

}
