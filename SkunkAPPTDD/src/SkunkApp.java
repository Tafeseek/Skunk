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
		  System.out.print("It is " + game.CurrentPlayer().getName() + "'s turn\n");
		  System.out.print("Press enter to go on\n");
		  inputValue.nextLine();
		  game.EndTurn();
		   
		}
}
}
