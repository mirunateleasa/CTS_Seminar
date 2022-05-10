package patterns.chainOfRes.classes;

public class Order
{
	private String foodName;
	private int difficulty;
	
	public Order(String foodName, int difficulty)
	{
		super();
		this.foodName = foodName;
		this.difficulty = difficulty;
	}
	public String getFoodName()
	{
		return foodName;
	}
	public void setFoodName(String foodName)
	{
		this.foodName = foodName;
	}
	public int getDifficulty()
	{
		return difficulty;
	}
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	@Override
	public String toString()
	{
		return "Order [foodName=" + foodName + ", difficulty=" + difficulty + "]";
	}
	
}
