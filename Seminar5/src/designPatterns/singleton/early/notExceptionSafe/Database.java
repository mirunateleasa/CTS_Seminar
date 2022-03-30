package designPatterns.singleton.early.notExceptionSafe;

//this is thread safe but uses memory regardless if we need it or not
//this cannot be used when throwing an exception (lazy init should be used)

public class Database {
	private static Database INSTANCE = new Database();
	private Database()
	{
		
	}
	public static Database getInstance()
	{
		return INSTANCE;
	}
}
