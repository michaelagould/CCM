import java.util.Scanner;

public class Circle
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the radius of a circle in inches: ");
		double r = i.nextDouble();
		System.out.println("The area of a circle with a radius of "+r+" is "+(Math.PI*(r*r))+" square inches, and has a circumference of "+(2*Math.PI*r));
	}
}