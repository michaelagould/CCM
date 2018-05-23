import java.util.Scanner;

public class Program6
{
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
	System.out.println("How many bottles of did you buy?");
	int bottles = read.nextInt();
	System.out.println("How much did each bottle cost?");
	int cost = read.nextInt();
	int result = bottles * cost;
	System.out.println("The cost of that many bottles at that price is: " + result);
	read.close();
	}
}