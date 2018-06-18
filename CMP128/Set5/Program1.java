import javax.swing.JOptionPane;

public class Program1
{
	public static void main(String[] args)
	{
		String list = "", descending;
		int copy, x = 1;
		while(x < 11)
		{
			list += x+"\n";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		
		list = "";
		x = 1;
		while(x < 11)
		{
			list += x+" ";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		
		list = "";
		x = 1;
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")) + 1;
		while(x < input)
		{
			list += x+"\n";
			x++;
		}
		JOptionPane.showMessageDialog(null, list);
		// BREAKS HERE
		list = "";
		x = 1;
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")) + 1;
		copy = input;
		
		
		while(input > x)
		{
			list += input+"/n";
			input--;
		}
		descending = list;
		list = "";
		while(x < copy)
		{
			list += x+" ";
			x--;
		}
	}
}