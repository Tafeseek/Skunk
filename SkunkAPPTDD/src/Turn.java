
public class Turn
{
	
	private Die die;
	private int score=0;
	private Player player;
//	
	public Turn(Player player,Die die)
	{
		this.player= player;
	   this.die = die;
	}
   

	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public Player getPlayer(){
		return player;
	}
    public void end()
   {
	this.player.setScore(player.getScore()+this.score);
   }

	

}
