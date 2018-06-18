import javax.swing.JOptionPane;

public class Mail
{
	public static void main(String[] args)
	{
		double weightLimit = 70.0, lowFee = 5.00, highFee = 90.00, lowRate = 0.65, highRate = 0.20;
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight of package: "));
		if(weight < weightLimit)
			JOptionPane.showMessageDialog(null, "The cost of your package is "+(lowFee+(weight*lowRate)));
		else
			JOptionPane.showMessageDialog(null, "The cost of your package is "+(highFee+(weight*highRate)));
		
	}
}