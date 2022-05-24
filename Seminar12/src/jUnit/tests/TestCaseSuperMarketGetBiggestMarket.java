package jUnit.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jUnit.classes.EMarketType;
import jUnit.classes.Market;
import jUnit.classes.SuperMarket;
import jUnit.exceptions.ExceptionEmptyList;
import jUnit.exceptions.ExceptionMarketType;

public class TestCaseSuperMarketGetBiggestMarket
{
	static Market market1;
	static Market market2;
	static Market market3;
	static Market market4;
	static Market market5;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("-----------SetUpBeforeClass");
		
		market1 = new Market ("Sephora", 20, EMarketType.BEAUTY);
		market2 = new Market ("Douglas", 29, EMarketType.BEAUTY);
		market3 = new Market ("H&M", 40, EMarketType.CLOTHES);
		market4 = new Market ("Mobexpert", 100, EMarketType.DECORATIONS);
		market5 = new Market ("Zara", 20, EMarketType.CLOTHES);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("-----------TearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception
	{
		System.out.println("-----------SetUp");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("-----------TearDown");
	}

//	@Test
//	public void test()
//	{
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testRight ()
	{
		System.out.println("RIGHT");
		ArrayList<Market> markets = new ArrayList<>();
		markets.add(market1);
		markets.add(market2);
		markets.add(market3);
		markets.add(market4);
		markets.add(market5);
		SuperMarket supermarket = new SuperMarket("Electroputere", markets);
		try
		{
			String result = supermarket.getBiggestMarketByArea(EMarketType.BEAUTY);
//			if (result.equals("Douglas"))
//			{
//				assertTrue(true);
//			}
//			else 
//			{
//				assertTrue(false);
//			}
			assertEquals("Douglas", result);
		} catch (ExceptionMarketType e)
		{
			e.printStackTrace();
			fail("Shouldn't throw exception");
		} catch (ExceptionEmptyList e)
		{
			e.printStackTrace();
			fail("Shouldn't throw exception");
		}
	}
	
	@Test
	public void testBoundary ()
	{
		System.out.println("BOUNDARY");
		ArrayList<Market> markets = new ArrayList<>();
		markets.add(market1);
		SuperMarket supermarket = new SuperMarket("Electroputere", markets);
		try
		{
			String result = supermarket.getBiggestMarketByArea(EMarketType.BEAUTY);
			assertEquals("Sephora", result);
		} catch (ExceptionMarketType | ExceptionEmptyList e)
		{
			e.printStackTrace();
			fail("Shouldn't throw exception");
		}
	}
	
	@Test (expected = ExceptionEmptyList.class)
	public void testException () throws ExceptionEmptyList, ExceptionMarketType 
	{
		System.out.println("EXCEPTION");
		ArrayList<Market> markets = new ArrayList<>();
		SuperMarket supermarket = new SuperMarket("Electroputere", markets);
		String result = supermarket.getBiggestMarketByArea(EMarketType.BEAUTY);	
	}
	
	@Test
	public void testPerformance () throws ExceptionMarketType, ExceptionEmptyList
	{
		//DON'T start testing the performance here - test it only for the method
		System.out.println("PERFORMANCE");
		ArrayList<Market> markets = new ArrayList<>();
		markets.add(market1);
		markets.add(market2);
		markets.add(market3);
		markets.add(market4);
		markets.add(market5);
		SuperMarket supermarket = new SuperMarket("Electroputere", markets);
		
		double startTime = System.currentTimeMillis();
		String result = supermarket.getBiggestMarketByArea(EMarketType.BEAUTY);
		double endTime = System.currentTimeMillis();
		
		//assertEquals("Average performance", 0.5, (endTime-startTime));
		assertTrue("Good performance" , endTime-startTime <= 10);
	}
	
	public Market getBiggestMarket (EMarketType type, ArrayList<Market> markets)
	{
		markets.sort(new Comparator<Market>()
		{

			@Override
			public int compare(Market o1, Market o2)
			{
				if (o1.getArea() >= o2.getArea())
				{
					return 1;
				}
				else return -1;
			}
		});
		for (int i = 0; i<markets.size(); i++)
		{
			if (type == markets.get(i).getType())
			{
				return markets.get(i);
			}
		}
		return null;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarketType, ExceptionEmptyList
	{
		System.out.println("CROSS-CHECK");
		ArrayList<Market> markets = new ArrayList<>();
		markets.add(market1);
		markets.add(market2);
		markets.add(market3);
		markets.add(market4);
		markets.add(market5);
		SuperMarket supermarket = new SuperMarket("Electroputere", markets);
		
		String actual = supermarket.getBiggestMarketByArea(EMarketType.BEAUTY);
		String expected = this.getBiggestMarket(EMarketType.BEAUTY, markets).getName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInverse()
	{
		
	}
}
