import javax.swing.JOptionPane;

public class Program1
{
	public static void main(String[] args)
	{
		//STEP 1
		String list = "", descending;
		int copy, x = 1;
		while(x < 11)
		{
			list += x+"\n";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		//STEP 2
		list = "";
		x = 1;
		while(x < 11)
		{
			list += x+" ";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		//STEP 3
		list = "";
		x = 1;
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")) + 1;
		while(x < input)
		{
			list += x+"\n";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		// STEP 4
		list = "";
		x = 0;
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		copy = input;
		
		while(input > x)
		{
			list += input+" ";
			input--;
		}
		
		list += "\n";
		descending = list;
		list = "";
		while(x < copy)
		{
			list += copy+"\n";
			copy--;
		}
		JOptionPane.showMessageDialog(null, descending+list);
	}
}