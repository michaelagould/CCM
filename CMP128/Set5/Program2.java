import javax.swing.JOptionPane;

public class Program2
{
	public static void main(String[] args)
	{
		//STEP 1
		String list = "", descending;
		int copy, x = 1;
		int start = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to start at: "));
		int end = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to end with: "));
		int a = start;
		int b = end;
		if(a > b)
		{
			System.out.println("Invalid input, program closing");
			return 0;
		}
			
		while(a < b)
		{
			list += a+"\n";
			a++;
		}
		JOptionPane.showMessageDialog(null, list);
		//STEP 2
		list = "";
		a = start;
		while(a < b)
		{
			list += a+" ";
			a++;
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