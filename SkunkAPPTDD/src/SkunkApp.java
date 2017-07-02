import java.util.Scanner;
public class SkunkApp
{
	
 public static void main(String[] args)
{ 
	  Player playerOne = new Player("Tafesse");
	  Player playerTwo = new Player("Ashenafi");
	  PlayGame game = new PlayGame(playerOne, playerTwo); 
	  Scanner inputValue = new Scanner(System.in);
	  
	  System.out.print("Welcome to the Skunk Game");
	  
	  while (!game.isOver())
		{
		  println("It is " + game.CurrentPlayer().getName() + "'s turn\n");
		  println("Press enter to roll, q to end turn");
		  
		  String line = inputValue.nextLine();
		  if(line.startsWith("q"))
		  {
			  playerOne.setScore(100);
		  }
		 
		  game.EndTurn();
		   
		}
	  
	  println("Game over! The winner is " + game.getWinner());
	  	  
}
    private static void println(String s)
    {
    	System.out.print(s);
    }
    
}
