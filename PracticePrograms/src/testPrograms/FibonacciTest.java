package testPrograms;
import mainPrograms.FibonacciNum;
import mainPrograms.SmallestNum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

	@Test
	public void TestPosition()
	{
		int[] Fib=FibonacciNum.FibNum(10);
		int actual = Fib[9];
		Assert.assertEquals(actual, 34);
	}
	
	@Test
	public void TestCountNum()
	{
		int[] Fib=FibonacciNum.FibNum(8);
		int actual=Fib.length;
		Assert.assertEquals(actual,8 );
	}
	
	
}
