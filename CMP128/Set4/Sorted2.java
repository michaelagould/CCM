import javax.swing.JOptionPane;

public class Sorted2
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));
		if(a>b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(b>c)
		{
			int temp = b;
			b = c;
			c = temp;
		}
		
		if(a>b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		JOptionPane.showMessageDialog(null, a+"\n"+b+"\n"+c);
		JOptionPane.showMessageDialog(null, "Program Finished");
	}
}