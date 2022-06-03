package decorator.decorators;

import java.util.ArrayList;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;

public class DecoratorEducationCase extends DecoratorCase
{

	public DecoratorEducationCase(ACase basicCase)
	{
		super(basicCase);
		ArrayList<String> problems = this.caseToDecorate.getCaseProblems();
		problems.add("EDUCATION");
		this.setCaseProblems(problems);
	}
}
