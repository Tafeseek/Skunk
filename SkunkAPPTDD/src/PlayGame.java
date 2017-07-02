
public class PlayGame
{
    private static final int POINTS_TO_WIN = 100;
	private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private Player winner;
	public boolean isOver=false;
	private Turn turn;
    
	public PlayGame(Player playerOne, Player playerTwo)
	{
		this.playerOne= playerOne;
		this.playerTwo = playerTwo;
		this.currentPlayer= playerOne;
		this.turn = new Turn(playerOne,new RolleDie());
		
	}
	public Player CurrentPlayer()
	{
		return this.currentPlayer;
	}
	public void EndTurn()
	{
		if(this.currentPlayer.getScore()>=POINTS_TO_WIN)
		{
		this.winner= this.currentPlayer;
		this.isOver=true;
		}
       this.currentPlayer = this.currentPlayer.equals(playerOne)? playerTwo:playerOne;
		
	}
	
     public boolean isOver()
     {
    	 return isOver;
     }
	public Player getWinner()
	{
		if(!isOver)
			throw new IllegalStateException("Game is not over");
		else
		return winner;
	}
     
     
}
