import javax.swing.JOptionPane;

public class Gas2
{
	public static void main(String[] args)
	{
		double rg = 2.89, pr = 2.99, su = 3.09;
		int choice = Integer.parseInt(JOptionPane.showInputDialog("1. Regular\n2.Preimum\n3.Super\nEnter Choice: "));
		switch(choice)
		{
		case 1:
			JOptionPane.showMessageDialog(null, "The price for Regular gas is "+rg);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You have chosen Premium");
			JOptionPane.showMessageDialog(null, "The price for Premium gas is "+pr);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You have chosen Super");
			JOptionPane.showMessageDialog(null, "The price for Super gas is "+su);
		default:
			JOptionPane.showMessageDialog(null, "Error - Invalid choice");
		}			
		JOptionPane.showMessageDialog(null, "Goodbye");
	}
}