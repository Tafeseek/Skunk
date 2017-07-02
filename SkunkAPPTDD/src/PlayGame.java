
public class PlayGame
{
    private static final int POINTS_TO_WIN = 100;
	private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
	public boolean isOver=false;
    
	public PlayGame(Player playerOne, Player playerTwo)
	{
		this.playerOne= playerOne;
		this.playerTwo = playerTwo;
		this.currentPlayer= playerOne;
		
	}
	public Player CurrentPlayer()
	{
		return this.currentPlayer;
	}
	public void EndTurn()
	{
		if(this.currentPlayer.getScore()>=POINTS_TO_WIN)
		{
		this.isOver=true;
		}
       this.currentPlayer = this.currentPlayer.equals(playerOne)? playerTwo:playerOne;
		
	}
	
     public boolean isOver()
     {
    	 return isOver;
     }
     
     
}
