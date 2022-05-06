package composite;

public class Node extends ANode
{
	public  String nodeName;
	public  float nodePrice;
	
	public Node(String nodeName, float nodePrice)
	{
		super();
		this.nodeName = nodeName;
		this.nodePrice = nodePrice;
	}

	@Override
	public String getName()
	{
		return this.nodeName;
	}

	@Override
	public float getPrice()
	{
		return this.nodePrice;
	}
}
