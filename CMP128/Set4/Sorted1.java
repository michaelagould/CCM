import javax.swing.JOptionPane;

public class Sorted1
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
		if(a==b) 
			JOptionPane.showMessageDialog(null,"The number are the same");
		else
			if(a > b) 
				JOptionPane.showMessageDialog(null, b+","+a);
			else
				JOptionPane.showMessageDialog(null, a+","+b);
		JOptionPane.showMessageDialog(null, "Program Finished");
	}
}