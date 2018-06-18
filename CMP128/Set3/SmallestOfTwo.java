import javax.swing.JOptionPane;

public class SmallestOfTwo
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
		if(a<b)
			JOptionPane.showMessageDialog(null, a+" is the smaller of the two");
		else
			JOptionPane.showMessageDialog(null, b+" is the smaller of the two");
	}
}