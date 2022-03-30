package designPatterns.singleton.lazy.threadSafe;

//this is multithreading safe AND exception safe
//this is the best for the exam

public class Database {
	private static Database INSTANCE = null;
	
	private Database()
	{

	}
	public static Database getInstance()
	{
		if (INSTANCE == null)
		{
			synchronized (Database.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = new Database();	
				}
			}
		}
		return INSTANCE;
	}
}
