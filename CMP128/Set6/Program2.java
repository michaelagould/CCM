import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Program2 
{
	public static void main(String[] args) throws IOException
	{
		int count = 0;
		String line, output;
		String name = JOptionPane.showInputDialog("Enter file path: ");
		FileReader f = new FileReader(name);
		BufferedReader g = new BufferedReader(name);
		while((line = g.readLine()) != null)
		{
			output += line+"\n";
			count++;
		}
		JOptionPane.showMessageDialog(null, output +"Total number of values: "+count);
		g.close();
	}
}