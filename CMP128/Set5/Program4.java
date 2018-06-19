import javax.swing.JOptionPane;

public class Program4
{
	public static void main(String[] args)
	{
		//STEP 1
		String list = "", descending;
		int copy;
		int start = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to start at: "));
		int end = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to end with: "));
		int a = start;
		int b = end;
		if(a > b)
		{
			System.out.println("Invalid input, program closing");
			return 0;
		}
		for(; a < b; a++)
			list += a+"\n";
		JOptionPane.showMessageDialog(null, list);
		
		//STEP 2
		list = "";
		a = start;
		
		for(; a < b; a++)
			list += a+" ";
		JOptionPane.showMessageDialog(null, list);
		
		//STEP 3
		list = "";
		x = 1;
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")) + 1;
		for(int x = 1; x < input; x++)
			list += x+"\n";
		JOptionPane.showMessageDialog(null, list);
		
		// STEP 4
		list = "";
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		copy = input;
		
		for(; input > x; input--)
			list += input+" ";
		list += "\n";
		descending = list;
		list = "";
		
		for(; x < copy; copy--)
			list += copy+"\n";
		JOptionPane.showMessageDialog(null, descending+list);
	}
}