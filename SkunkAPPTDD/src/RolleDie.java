import java.util.Random;

public class RolleDie implements Die
{
	private static Random RANDOM = new Random();
	@Override
	public int roll()
	{
		return RANDOM.nextInt(6) + 1;
	}
	

}
