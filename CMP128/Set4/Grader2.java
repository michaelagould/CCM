import javax.swing.JOptionPane;

public class Grader2
{
	public static void main(String[] args)
	{
		int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter grade: "));
		
		if(grade < 80)
			JOptionPane.showMessageDialog(null, "You scored an F");
		else
			if(grade <= 89)
				JOptionPane.showMessageDialog(null, "You scored a B");
			else
				JOptionPane.showMessageDialog(null, "You scored an A");
	}
}