
public class PlayGame
{
    private static final int POINTS_TO_WIN = 100;
    private static RollDie DIE = new RollDie();
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
		this.turn = new Turn(playerOne,DIE);
		
	}
	public Player CurrentPlayer()
	{
		return turn.getPlayer();
	}
	public void EndTurn()
	{
		turn.end();
		if(this.currentPlayer.getScore()>=POINTS_TO_WIN)
		{
		this.winner= this.currentPlayer;
		this.isOver=true;
		}
		
		turn = new Turn(CurrentPlayer().equals(playerOne) ? playerTwo : playerOne,DIE);
		
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
	public void roll()
	{
		turn.roll();
		
	}
	public Turn currentTurn()
	{
		
		return turn;
	}
     
     
}
