import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TurnTest
{

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception
//	{
//	}
//
//	@Before
//	public void setUp() throws Exception
//	{
//	}
//
  @Test
	public void getScore_startsAtZero()
	{
		Turn turn = new Turn();
		
		assertEquals(0,turn.getScore());
	}

}
