import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ThreeAvg
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.000");
		int sum = 0;
		sum += Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));
		sum += Integer.parseInt(JOptionPane.showInputDialog("Enter number 2: "));
		sum += Integer.parseInt(JOptionPane.showInputDialog("Enter number 3: "));
		JOptionPane.showMessageDialog(null, "The average is: "+a.format(sum/3.0));
	}
}