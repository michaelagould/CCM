import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class WaterComm
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.00");
		int waterLimit = 300;
		double rate = .08, amount = Double.parseDouble(JOptionPane.showInputDialog("Enter gallons used: "));
		JOptionPane.showMessageDialog(null, "You owe $"+a.format(rate*amount));
		if(amount > waterLimit)
			JOptionPane.showMessageDialog(null, "Please pay bill at the Utility company");
	}
}