package testPrograms;
import mainPrograms.PingPong;
import mainPrograms.PrimeNum;

import org.testng.Assert;
import org.testng.annotations.Test;



public class PrimeTest {
	@Test
	public void Testnum1()
	{
		String actual=PrimeNum.Prime(15);
		Assert.assertEquals(actual,"Not Prime" );
	}
	@Test
	public void Testnum2()
	{
		String actual=PrimeNum.Prime(97);
		Assert.assertEquals(actual,"Prime" );
	}
}
