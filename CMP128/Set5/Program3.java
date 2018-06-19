import javax.swing.JOptionPane;

public class Program3
{
	public static void main(String[] args)
	{
		//STEP 1
		String list = "", descending;
		int copy
		
		for(int i = 1; i < 11 i++)
			list += x+"\n";
		JOptionPane.showMessageDialog(null, list);
		
		//STEP 2
		list = "";
		for(i = 1; i < 11; i++)
			list += x+" ";
		JOptionPane.showMessageDialog(null, list);
		
		//STEP 3
		list = "";
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")) + 1;
		
		for(i = 1; i < input; i++)
			list += x+"\n";
		JOptionPane.showMessageDialog(null, list);
		
		//STEP 4
		list = "";
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		copy = input;
		for(i = 0; input > i; input--)
			list += input+" ";
		list += "\n";
		descending = list;
		list = "";
		for(; x < copy; copy--)
			list += copy+"\n";
		JOptionPane.showMessageDialog(null, descending+list);
	}
}