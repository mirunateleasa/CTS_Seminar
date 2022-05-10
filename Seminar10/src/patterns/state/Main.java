package patterns.state;

import patterns.state.states.EStateTypes;

public class Main
{
	public static void main(String[] args)
	{
		Employee employee = new Employee();
		
		employee.setCurrentState(EStateTypes.WORKING);
		employee.act("Solve BUG");
		
		employee.setCurrentState(EStateTypes.VACATION);
		employee.act("Solve Server Down");
	}
}
