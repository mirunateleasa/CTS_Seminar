package designPatterns.singleton.wrong;

public class Main {

	public static void main(String[] args) {
			Database db1 = new Database();		//this connects us to the database already
			Database db2 = new Database (); 	//this also connects us to the database
			//you have two connection to the same database?????
	}

}
