public class Turn
{

	private static final int SKUNK_ROLL = 1;
	private Player player;
	private Die die;
	private int score = 0;
	private boolean isOver = false;

	public Turn(Player player, Die die)
	{
		this.player = player;
		this.die = die;
	}

	public int getScore()
	{
		return score;
	}
	
	/*Simulate one turn of the game, making up to rollsPerTurn rolls of 
	 * the dice, returning the new point total. When the total number of
	 *points exceeds 100, or we roll a 1 on either die, the turn ends
	 * without accumulating any points.  If we roll snake eyes, the point 
	 * total goes back to zero. 
    */

	public int roll()
	{
		int roll = die.roll();
		if (roll == SKUNK_ROLL)
		{
			score = 0;
			isOver = true;
		} else
		{
			score += roll;
		}
		return roll;
	}

	void setScore(int score)
	{
		this.score = score;
	}

	public void end()
	{
		this.player.setScore(player.getScore() + this.score);
		this.isOver = true;
	}

	public Player getPlayer()
	{
		return player;
	}

	public boolean isOver()
	{
		return isOver;
	}
}
