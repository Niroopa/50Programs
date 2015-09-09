package testPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

import mainPrograms.MissingNum;




public class MissingTest {

	@Test
	public void MissTest1()
	{   int [] arr={5,3,1,4,6};
		int actual=MissingNum.sorting(arr, 15);
		Assert.assertEquals(actual,0 );
	}
	
	@Test
	public void MissTest2()
	{   int [] arr={5,3,1,4,6};
		int actual=MissingNum.sorting(arr, 3);
		Assert.assertEquals(actual,3 );
	}
}
