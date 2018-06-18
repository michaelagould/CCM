import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Overtime1
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.00");
		double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked: "));
		double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly rate: "));
		if(hours < 40.0)
			JOptionPane.showMessageDialog(null, "The weekly salary is "+a.format(hours*rate));
		else
			JOptionPane.showMessageDialog(null, "The weekly salary is "+a.format((40.0*rate)+((hours - 40.0)*(rate*1.5))));	
	}
}