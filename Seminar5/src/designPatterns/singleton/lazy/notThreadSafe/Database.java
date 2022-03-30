package designPatterns.singleton.lazy.notThreadSafe;

//this is not thread safe but it's exception safe
//don't use this.

public class Database {
	private static Database INSTANCE = null;
	static {
		try {
			INSTANCE = new Database(-1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private Database(int something) throws Exception
	{
		if (something < 0 )
		{
			throw new Exception();
		}
	}
	public static Database getInstance()
	{
		return INSTANCE;
	}
}
