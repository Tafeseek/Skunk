import java.util.Scanner;
public class SkunkApp
{
	
 public static void main(String[] args)
{ 
	  Player playerOne = new Player("Tafesse");
	  Player playerTwo = new Player("Ashenafi");
	  PlayGame game = new PlayGame(playerOne, playerTwo); 
	  Scanner inputValue = new Scanner(System.in);
	  
	  System.out.print("Welcome to the Skunk Game \n");
	  
	  while (!game.isOver())
		{
		  println(playerOne.getName()+ "'score is "+playerOne.getScore() + "\n");
		  println(playerTwo.getName()+ "'score is "+playerTwo.getScore()+"\n");
		  println("It is " + game.CurrentPlayer().getName() + "'s turn\n");
		  println("Press enter to go");
		  
		  String line = inputValue.nextLine();
		  if(line.startsWith("!"))
		  {
			  playerOne.setScore(100);
		  }
		 
		  game.EndTurn();
		   
		}
	  
	  println("Game over! The winner is " + game.getWinner().getName());
	  	  
}
    private static void println(String s)
    {
    	System.out.print(s);
    }
    
}
