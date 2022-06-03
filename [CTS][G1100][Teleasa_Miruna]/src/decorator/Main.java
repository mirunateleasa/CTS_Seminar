package decorator;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;
import decorator.decorators.DecoratorPovertyCase;
import decorator.decorators.DecoratorRefugeeCase;
import decorator.decorators.DecoratorViolenceCase;

public class Main
{
	public static void main(String[] args)
	{		
		ACase romaniaCase = new CaseBasic(0, "Romania", 35000);
		System.out.println("BASIC CASE: \n\t" + romaniaCase.describeProblems());
		
		romaniaCase = new DecoratorPovertyCase(romaniaCase);
		System.out.println("POVERTY CASE: \n\t" + romaniaCase.describeProblems());
				
		ACase syriaCase = new DecoratorRefugeeCase(new CaseBasic(1, "Syria", 20000));
		System.out.println("REFUGEE CASE: \n\t" + syriaCase.describeProblems());
		
		ACase sudanCase = new DecoratorViolenceCase(new DecoratorPovertyCase(new CaseBasic(1, "Sudan", 50000)));
		System.out.println("VIOLENCE & POVERTY CASE: \n\t" + sudanCase.describeProblems());
	}
}
