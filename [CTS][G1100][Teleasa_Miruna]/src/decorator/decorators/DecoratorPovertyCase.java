package decorator.decorators;

import java.util.ArrayList;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;

public class DecoratorPovertyCase extends DecoratorCase
{
	public DecoratorPovertyCase(ACase basicCase)
	{
		super(basicCase);
		ArrayList<String> problems = this.caseToDecorate.getCaseProblems();
		problems.add("POVERTY");
		this.setCaseProblems(problems);
	}
}
