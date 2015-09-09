package testPrograms;
import mainPrograms.FactorialExample;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialTest {
	
	@Test
	
		public void TestPositiveNum()
		{
			int actual=FactorialExample.Fact(6);
			Assert.assertEquals(actual,720 );
		}
		
		@Test
		public void Testwithzero()
		{
			int actual=FactorialExample.Fact(0);
			Assert.assertEquals(actual,0);
		}
		
		
}
