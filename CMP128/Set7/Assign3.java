import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Assign3
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.00");
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Salary: "));
		int bracket = Integer.parseInt(JOptionPane.showInputDialog("Bracket: "));
		JOptionPane.showMessageDialog("Taxes owed : $"a.format(calcTax(salary,bracket)));
	}
	
	private static double calcTax(double salary, int taxBracket)
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