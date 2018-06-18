import javax.swing.JOptionPane;

public class Grader1
{
	public static void main(String[] args)
	{
		int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter grade: "));
		if(grade > 0)
		{
			if(grade > 50)
				JOptionPane.showMessageDialog(null, "You Passed!");
			else
			{
				if(grade < 50)
					JOptionPane.showMessageDialog(null, "You Failed!");
				else
					JOptionPane.showMessageDialog(null, "On Probation.");
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid input");
	}
}