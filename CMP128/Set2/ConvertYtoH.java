import java.util.Scanner;

public class ConvertYtoH
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter number of years: ");
		int years = i.nextInt();
		System.out.println(years+" years has "+(years*12*30*24)+" hours.");
	}
}