package testPrograms;
import mainPrograms.LinearSearch;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

public class LinearSearchTest {

@Test
public void lineartest1()
{
	int [] arr={5,3,1,4,6};
    int a=4;
	int actual=LinearSearch.LinSearch(arr,a);
	Assert.assertEquals(actual,2 );
}
@Test
public void lineartest2()
{
int [] arr={5,3,1,4,6};
int a=10;
int actual=LinearSearch.LinSearch(arr,a);
Assert.assertEquals(actual,-1);

}
@Test
public void lineartest3()
{
int [] arr={5,3,1,4,6};
int a=0;
int actual=LinearSearch.LinSearch(arr,a);
Assert.assertEquals(actual,-1);

}
}

