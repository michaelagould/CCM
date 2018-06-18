import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Program3 
{
	public static void main(String[] args) throws IOException
	{
		int posCount = 0, negCount = 0;
		String line, output;
		String name = JOptionPane.showInputDialog("Enter file path: ");
		FileReader f = new FileReader(name);
		BufferedReader g = new BufferedReader(f);
		while((line = g.readLine()) != null)
		{
			if(Integer.parseInt(line) > 0)
				posCount++;
			else
				negCount++;
		}
		JOptionPane.showMessageDialog(null,"Number of positive values: "+posCount+"\nNumber of negative values: "+negCount);
		g.close();
	}
}