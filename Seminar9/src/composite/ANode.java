package composite;

public abstract class ANode	//this can be either another structure (category) or a leaf
{
	public abstract String getName();
	public abstract float getPrice();
	
	public String getInfo()
	{
		return this.getName() + ": "  + this.getPrice();
	}
	
	public void addNode (ANode nodeToAdd) throws Exception
	{
		throw new Exception();
	}
	
	public void removeNode (ANode nodeToRemove) throws Exception
	{
		throw new Exception();
	}
	
	public ANode getNodeAt (int index) throws Exception
	{
		throw new Exception(); 
	}
}
