import java.util.Scanner;

public class Calendar1
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("How many days? ");
		int input = i.nextInt();
		int years = input/365;
		int months = (input-(years*365))/30;
		int weeks = (input-(years*365)-(months*30))/7;
		int days = input-(years*365)-(months*30)-(weeks*7);
		System.out.println(input+" days equals: "+years+" years, "+months+" months, "+weeks+" week and "+days+" days.");
	}
}