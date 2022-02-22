package ro.ase.classes;

public class Utils {
	
//1. function that returns the no of occurrences of the smallest value in an array
	//my function:
	public static int noOccurenceMin (int []array)
	{
		int noOcc = 0, min = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == min)
			{
				noOcc ++;
			}
		}
		return noOcc;
	}
	
	//good function:
	public static int noOccurenceMinGood (int []array)
	{
		int noOcc = 0, min = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
				noOcc = 1;
			}
			else if (array[i] == min)
			{
				noOcc++;
			}
		}
		return noOcc;
	}
}
