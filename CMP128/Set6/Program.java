import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter dog = new FileWriter("C:\\Java\\CMP128\\data.cheese");
		PrintWriter cat = new PrintWriter(dog);
		cat.println("Hello World");
		cat.close();
	}
}