package testPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;
import mainPrograms.CommonArray;


public class CommonNumTest {

	@Test
	public void PositiveCommonTest1()
	{   int [] arr={5,3,1,4,6};
    int [] arr1={10,9,3,5,7};
	int actual=CommonArray.commonNum(arr, arr1 );
	Assert.assertEquals(actual,3 );
	}
	
	@Test
	public void NegativeCommonTest1()
	{   int [] arr={-5,-8,-1};
	    int [] arr1={-9,-3,-5};
		int actual=CommonArray.commonNum(arr, arr1 );
		Assert.assertEquals(actual,-5 );
	}
	
	@Test
	public void RepeatedCommonTest1()
	{   int [] arr={3,3,3};
	    int [] arr1={3,3,3};
		int actual=CommonArray.commonNum(arr, arr1 );
		Assert.assertEquals(actual,3 );
	}
}
