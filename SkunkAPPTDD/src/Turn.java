
public class Turn
{
	//private static final int SKUNK_ROLL = 1;
	private Die die;
	private int score  = 0;
	private Player player;
	private boolean isOver = false;
//	
	public Turn(Player player,Die die)
	{
		this.player= player;
	    this.die = die;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public void roll()
	{
		score+= die.roll();
	}
	
	public int getScore()
	{
		return score;
	}
	
	
	
	
	public Player getPlayer(){
		return player;
	}
    public void end()
   {
	this.player.setScore(player.getScore() + this.score);
   }

	

}
