import javax.swing.JOptionPane;

public class DetermineSS
{
	public static void main(String[] args)
	{
		int ssAge = 65;
		if(Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")) >= ssAge)
			JOptionPane.showMessageDialog(null, "You qualify for social security.");
		else
			JOptionPane.showMessageDialog(null, "You do not qualify for social security.");
	}
}