package decorator.decorators;

import decorator.classes.ACase;
import decorator.classes.CaseBasic;

public class DecoratorCase extends ACase
{
	protected ACase caseToDecorate;
	
	public DecoratorCase (ACase basicCase)
	{
		this.caseToDecorate = basicCase;
	}
}
