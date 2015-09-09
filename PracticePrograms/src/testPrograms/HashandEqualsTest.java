package testPrograms;
import mainPrograms.HashandEquals;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

public class HashandEqualsTest {

	@Test
	public void PositiveTest()
	{   
		String a="Lucky";
		String b="Lucky";
	String actual=HashandEquals.equalSame(a,b);
		Assert.assertTrue(a.equals(b));
		
	}

	@Test
	public void NegativeTest()
	{   
		String a="Lucky";
		String b="Luck";
	String actual=HashandEquals.equalSame(a,b);
		Assert.assertFalse(a.equals(b));
		
		
	}
/*	@Test
	public void HashTest()
	{   
		String c="Lucky";
		String d="Lucky";
	String actual=HashandEquals.HashSearch(c,d);
			Assert.assertSame(c.hashCode(),d.hashCode());
			Assert.assertEquals(actual,c.hashCode());
			Assert.assertEquals(actual,d.hashCode());
	
	}
	

	@Test
	public void HashTest1()
	{   
		String c="Lucky";
		String d="Luck";
	String actual=HashandEquals.HashSearch(c,d);
		Assert.assertNotSame(c.hashCode(),d.hashCode());
		Assert.assertEquals(actual,"x");
		Assert.fail();
	}*/
	
	
	}

