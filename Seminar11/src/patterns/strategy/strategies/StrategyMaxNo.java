package patterns.strategy.strategies;

public class StrategyMaxNo implements IStrategyFindSpecificNo
{

	@Override
	public int process(int[] vector)
	{	
		if (vector.length <= 0)
		{
			return -1;
		}
		int max = 0;
		for (int i = 0; i<vector.length; i++)
		{
			if (max < vector[i])
			{
				max = vector[i];
			}
		}
		return max;
	}
}
