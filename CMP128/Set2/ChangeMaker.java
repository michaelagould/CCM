import java.util.Scanner;

public class ChangeMaker
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the number of pennies: ");
		int input = i.nextInt();
		int quarters = input / 25;
		int dimes = (input-(quarters*25))/10;
		int nickles = (input-(quarters*25)-(dimes*10))/5;
		int pennies = input-(quarters*25)-(dimes*10)-(nickles*5);
		System.out.println(input+" pennies = "+quarters+" quarters, "+dimes+" dimes, "+nickles+" nickles and "+pennies+" pennies");
	}
}