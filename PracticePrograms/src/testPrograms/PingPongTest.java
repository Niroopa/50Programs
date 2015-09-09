package testPrograms;
import mainPrograms.PingPong;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PingPongTest {
	@Test
	public void Testnum1()
	{
		String actual=PingPong.Ping(15);
		Assert.assertEquals(actual,"Ping Pong" );
	}
	
	@Test
	public void Testnum2()
	{
		String actual=PingPong.Ping(9);
		Assert.assertEquals(actual,"Ping" );
	}
	
	@Test
	public void Testnum3()
	{
		String actual=PingPong.Ping(5);
		Assert.assertEquals(actual,"Pong" );
	}
	@Test
	public void Testnum4()
	{
		String actual=PingPong.Ping(38);
		Assert.assertEquals(actual,null );
	}
}

