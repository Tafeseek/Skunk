
public class Player
{
   private int score;
   private String name;
   
   Player (String name){
	   this.name= name;
   }
   
	public void setScore(int score)
	{	
	  this.score = score;
	}
    public int getScore()
    {
    	return this.score;
    }
    
    public String getName()
    {
    	return this.name;
    }
}
