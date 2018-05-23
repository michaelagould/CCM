import java.util.Scanner;

public class Program5
{
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
	System.out.print("How many courses are you taking this semester?:");
	int num = read.nextInt();
	System.out.print("Wow you are taking " + num + " classes!");
	read.close();
	}
}