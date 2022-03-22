package designPatterns.singleton.wrong;

public class Database {
	private int id;
	private String url;
	private void selectObj()
	{
		//do sth to select the object 
	}
	
	Database()
	{
		//connect method
	}
	
	Database(int id, String url)
	{
		//connect method
		this.id = id;
		this.url = url;
	}
}
