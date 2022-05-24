package jUnit.classes;

import java.util.ArrayList;

import jUnit.exceptions.ExceptionEmptyList;
import jUnit.exceptions.ExceptionMarketType;

public class SuperMarket
{
	private String name;
	//private int area; -- this is not corrrect (can be calculated based on markets size)
	private ArrayList<Market> markets;

	public SuperMarket()
	{
		super();
	}
	public SuperMarket(String name, ArrayList<Market> markets)
	{
		super();
		this.name = name;
		this.markets = markets;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public ArrayList<Market> getMarkets()
	{
		return markets;
	}
	public void setMarkets(ArrayList<Market> markets)
	{
		this.markets = markets;
	}


	public String getBiggestMarketByArea (EMarketType type) throws ExceptionMarketType, ExceptionEmptyList
	{
		if (type == null)
		{
			throw new ExceptionMarketType();
		}
		if (this.markets.size() == 0  || this.markets == null)
		{
			throw new ExceptionEmptyList();
		}
		float max = -1;
		String nameMaxMarket = "";
		for (Market market : markets)
		{
			if (market.getType() == type)
			{
				if (market.getArea() > max)
				{
					max = market.getArea();
					nameMaxMarket = market.getName();
				}
			}
		}
		return nameMaxMarket;
	}
}
