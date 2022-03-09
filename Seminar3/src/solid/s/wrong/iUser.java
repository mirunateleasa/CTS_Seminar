package solid.s.wrong;

public interface iUser {
	
	public boolean login (String username, String password);
	
	public boolean register (String email, String username, String password);
	
	//is this part of the User activity?
	public boolean SendEmail (String content);
	
	//is this part of the User activity?
	public void LogError (String errorContent);
}
