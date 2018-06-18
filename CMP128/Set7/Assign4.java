import java.util.Random;

public class Assign4
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 20; i++)
			throwDie();
	}
	
	private static int throwDie()
	{
		int min = 1, max = 6;
		Random gen = new Random(System.currentTimeMillis());
		System.out.println(min + gen.nextInt(max));
	}
}