import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Program4 
{
	public static void main(String[] args) throws IOException
	{
		int count = 0, part;
		String name = JOptionPane.showInputDialog("Enter file path: ");
		part = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
		FileReader f = new FileReader(name);
		BufferedReader g = new BufferedReader(f);
		FileWriter h = new FileWriter(name);
		while((line = g.readLine()) != null)
		{
			if(Integer.parseInt(line) > 0 && Integer.parseInt(line) <= part)
				output += line+"\n"
		}
		h.println(output);
		g.close();
	}
}