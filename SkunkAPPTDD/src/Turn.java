public class Turn
{

	private static  int SKUNK_ROLL = 1;
	private Player player;
	private Die die1;
    private Die die2;
	private int score = 0;
	private boolean isOver = false;
	private int rol1 ;
	private int rol2;

	public Turn(Player player, Die die1, Die die2)
	{
		this.player = player;
		this.die1 = die1;
		this.die2= die2;
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
		rol1 = die1.roll();
		rol2 = die2.roll();
		
		if (rol1 == SKUNK_ROLL && rol2 ==SKUNK_ROLL)
		{
			score = 0;
			isOver = true;
		} 
		
		else if(rol1 == SKUNK_ROLL ||rol2 ==SKUNK_ROLL)
		{
			isOver = true;
			
		}
		else
		{
			score += rol1+rol2;
		}
		return score;
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

	@Override
	public String toString()
	{
		return "[die1=" + rol1 + ", die2=" + rol2 + "]";
	}
	
}
