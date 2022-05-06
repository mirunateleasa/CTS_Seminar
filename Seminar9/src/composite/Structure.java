package composite;

import java.util.ArrayList;

public class Structure extends ANode
{
	private ArrayList <ANode> list = new ArrayList<ANode>();
	private String nameStructure;

	public Structure(String nameStructure)
	{
		super();
		this.nameStructure = nameStructure;
	}

	@Override
	public String getName()
	{
		return this.nameStructure;
	}

	@Override
	public float getPrice()
	{
		throw new UnsupportedOperationException();
	}

	//but we consider that in ANode we have a method getInfo that uses the price (so we neet to override it)
	@Override
	public String getInfo()
	{
		String info = "STRUCTURE: " +  this.nameStructure;
		for (ANode node : list)
		{
			info += "\n";
			info += node.getInfo();
		}
		return info;
	}

	@Override
	public void addNode(ANode nodeToAdd) throws Exception
	{
		this.list.add(nodeToAdd);
	}

	@Override
	public void removeNode(ANode nodeToRemove) throws Exception
	{
		this.list.remove(nodeToRemove);
	}

	@Override
	public ANode getNodeAt(int index) throws Exception
	{
		return list.get(index);
	}
	
	
	
	
}
