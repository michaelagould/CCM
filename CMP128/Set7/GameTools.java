import java.util.Random;

public class GameTools
{
	private static int throwDie()
	{
		int min = 1, max = 6;
		Random gen = new Random(System.currentTimeMillis());
		System.out.println(min + gen.nextInt(max));
	}
}