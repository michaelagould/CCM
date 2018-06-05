import java.lang.Math;
import java.util.Scanner;

public class Table1
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter value: ");
		int input=i.nextInt();
		System.out.println((input-3)+"\t"+Math.pow(input-3,(1.0/2))+"\t"+Math.pow(input-3,(1.0/3)));
		System.out.println((input-2)+"\t"+Math.pow(input-2,(1.0/2))+"\t"+Math.pow(input-2,(1.0/3)));
		System.out.println((input-1)+"\t"+Math.pow(input-1,(1.0/2))+"\t"+Math.pow(input-1,(1.0/3)));
		System.out.println((input)+"\t"+Math.pow(input,(1.0/2))+"\t"+Math.pow(input,(1.0/3)));
	}
}
