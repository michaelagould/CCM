import java.util.Scanner;
import java.text.DecimalFormat;

public class Program1
{
	public static void main(String[] args)
	{
		int choice = 0;
		double inputTemp = 0.0;
		while(choice !=3)
		{
			DecimalFormat a = new DecimalFormat("#0.000");
			Scanner f = new Scanner(System.in);
			System.out.println("\tTemperature Converter\n1 Fahrenheit to Celsius\n2 Celsius to Fahrenheit\n3 Quit");
			System.out.print("Enter choice: ");
			choice = f.nextInt();
			if(choice == 1 || choice || 2)
			{
				System.out.print("Enter temperature: ");
				inputTemp = f.nextDouble();
			}
			switch(choice)
			{
				case 1:
					System.out.println(inputTemp+" converted from Fahrenheit to Celsius is: "+a.format(FtoC(inputTemp)));
					break;
				case 2:
					System.out.println(inputTemp+" converted from Fahrenheit to Celsius is: "+a.format(CtoF(inputTemp)));
					break;
				case 3:
					break;
				default:
					System.out.println("Invalid input ");
			}
		}
	}
	private static double FtoC(double temp){return (temp - 32.0) * (5/9.0);}
	private static double CtoF(double temp){return (temp * 9.0/5) + 32.0;}
}