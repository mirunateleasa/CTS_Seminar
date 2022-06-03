package chainOfResponsability.classes;

public abstract class ACaseHandler
{
	public ACaseHandler successor;
	
	public void setSuccessor (ACaseHandler successor)
	{
		this.successor = successor;
	}
	public abstract void handleCase(Case caseToHandle);
}
	
