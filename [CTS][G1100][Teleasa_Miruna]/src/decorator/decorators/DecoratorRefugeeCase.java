package decorator.decorators;

import java.util.ArrayList;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;

public class DecoratorRefugeeCase extends DecoratorCase
{

	public DecoratorRefugeeCase(ACase basicCase)
	{
		super(basicCase);
		ArrayList<String> problems = this.caseToDecorate.getCaseProblems();
		problems.add("REFUGEE");
		this.setCaseProblems(problems);
	}
}
