import java.util.Scanner;

public class DaysToWeeks
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter number of days: ");
		int days = i.nextInt();
		System.out.println(days+" days equals "+(days/7)+" weeks, and "+(days%7)+" days.");
	}
}