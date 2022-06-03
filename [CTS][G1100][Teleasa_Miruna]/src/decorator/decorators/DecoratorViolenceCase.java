package decorator.decorators;

import java.util.ArrayList;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;

public class DecoratorViolenceCase extends DecoratorCase
{
	public DecoratorViolenceCase(ACase basicCase)
	{
		super(basicCase);
		ArrayList<String> problems = this.caseToDecorate.getCaseProblems();
		problems.add("VIOLENCE");
		this.setCaseProblems(problems);
	}
}
