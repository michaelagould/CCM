import java.util.Scanner;

public class Avg4
{
	public static void main(String[] args)
	{
	int a, b, c, d;
	Scanner i = new Scanner(System.in);
	System.out.print("Enter first number: ");
	a=i.nextInt();
	System.out.print("Enter second number: ");
	b=i.nextInt();
	System.out.print("Enter third number: ");
	c=i.nextInt();
	System.out.print("Enter fourth and final number: ");
	d=i.nextInt();
	System.out.print("The average of "+a+", "+b+", "+c+", and "+d+" is: "+(a+b+c+d)/4.0+"\n");
	}
}