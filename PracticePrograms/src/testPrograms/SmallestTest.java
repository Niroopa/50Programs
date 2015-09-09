package testPrograms;
import mainPrograms.SmallestNum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestTest {


	@Test
	public void TestNegativeNum()
	{
		int[] arr={-10,-34,-2,-15,-12};
		int actual=SmallestNum.findSmallest(arr);
		Assert.assertEquals(actual, -34);
	}
   @Test
	public void TestDuplicateNum()
	{
	   int[] arr={2,10,2,33,15};
	   int actual=SmallestNum.findSmallest(arr);
	   Assert.assertEquals(actual,2);
	}
   
   @Test
   public void TestZeroNum()
   {
	   int[] arr={5,0,3,20,30};
	   int actual=SmallestNum.findSmallest(arr);
	   Assert.assertEquals(actual,0);
	}
   }
	


