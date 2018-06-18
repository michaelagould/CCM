public class TaxTools
{
	public static double calcTax(double salary, int taxBracket)
	{
		switch(taxBracket)
		{
			case 1:
				return salary * .03;
			case 2:
				return salary * .05;
			case 3:
				return salary * .07;
			default:
				return 0.0;
		};
	}

}