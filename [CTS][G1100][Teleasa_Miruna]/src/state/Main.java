package state;

import state.classes.Case;
import state.classes.ICase;

public class Main
{
	public static void main(String[] args)
	{
		ICase newCase = new Case(0, "Romania", 5000, 5);
		newCase.startCase(3);
		newCase.workOnCase(1000);
		newCase.workOnCase(800);
		newCase.finishCase();
		
		ICase anotherCase = new Case(1, "Syria", 1000, 5);
		anotherCase.workOnCase(500);
		anotherCase.finishCase();
		anotherCase.startCase(2);
		anotherCase.workOnCase(500);
		anotherCase.startCase(1);
	}
}
