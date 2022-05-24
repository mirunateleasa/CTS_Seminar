package jUnit.classes;

public class Market
{
	private String name;
	private float area;
	private EMarketType type;
	
	public Market()
	{
		super();
	}
	public Market(String name, float area, EMarketType type)
	{
		super();
		this.name = name;
		this.area = area;
		this.type = type;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getArea()
	{
		return area;
	}
	public void setArea(float area)
	{
		this.area = area;
	}
	public EMarketType getType()
	{
		return type;
	}
	public void setType(EMarketType type)
	{
		this.type = type;
	}
	

	
}
