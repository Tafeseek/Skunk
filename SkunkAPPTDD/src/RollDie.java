import java.util.Random;

public class RollDie implements Die
{
	private static final Random RANDOM = new Random();

	@Override
	public int roll()
	{
		return RANDOM.nextInt(6) + 1;
	}
}
