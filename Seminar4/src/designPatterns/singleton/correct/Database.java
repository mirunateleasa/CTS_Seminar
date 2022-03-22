package designPatterns.singleton.correct;

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!THIS IS A SINGLETON but a Lazy Initialization Class (not the best, not allowed to be done at exam) 
	//if we have 2 different threads in the same time and the INSTANCE is null, they both create an instance => we'll have 2 instances (aka Not Thread Safe)
public class Database {
	private static Database INSTANCE;
	private int id;
	private String url;
	private void selectObj()
	{
		//do sth to select the object 
	}
	
	private Database()
	{
		//connect method
	}
	
	private Database(int id, String url)
	{
		//connect method
		this.id = id;
		this.url = url;
	}
	
	public static Database getInstance ()
	{
		if (INSTANCE == null)	//daca nu exista
		{
			INSTANCE = new Database();	//o cream
		}
		return INSTANCE;		//o returnam (daca exista pe cea existenta, daca nu exista pe cea creata)
	}
}
