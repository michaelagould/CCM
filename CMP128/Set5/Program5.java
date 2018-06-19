import java.util.Scanner;
import java.text.DecimalFormat;

public class Program5
{
	public static void main(String[] args)
	{
		DecimalFormat a = new DecimalFormat("#0.00");
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a number to start at: ")
		int start = i.nextInt();
		System.out.print("Enter a number to end at: ")
		int end = i.nextInt();
		if(start > end)
		{
			System.out.println("Invalid input, program closing");
			return 0;
		}
		
		for(; start < end; start++)
			System.out.println(start+":\t"+a.format(Math.sqrt(start))+"\t"+a.format(Math.crbt(start))+"\t"+a.format(Math.exp(Math.E,start)));	
	}
}