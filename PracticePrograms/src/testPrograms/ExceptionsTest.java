package testPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.*;

import mainPrograms.ExcpetionsExample;
import mainPrograms.ExcpetionsExample.*;

public class ExceptionsTest
{
	@Test
	public void numberformattest()
	{

		try{
			int a=0,b=0;
		//Assert.assertEquals(ExcpetionsExample.child(4), "ArrayIndexOutOfBounds");
	    b=ExcpetionsExample.child(a);			
		}catch(ArrayIndexOutOfBoundsException ae)
		{
//			System.out.println("test123"+ae.toString());
//			Assert.assertEquals(ae, "ArrayIndexOutOfBoundsException");
			Assert.assertEquals(ae.toString(), "java.lang.ArrayIndexOutOfBoundsException: 3");			
		}
//		Assert.assertEquals(actual,"NumberFormatException" );
//		Assert.assertEquals(ExcpetionsExample.child("apple"), "Arr Exception");
	}
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void negativeTest(){
		try{

			String str="happy";int i=0;
		//Assert.assertEquals(ExcpetionsExample.child(4), "ArrayIndexOutOfBounds");
	    i=ExcpetionsExample.child1(str);			
		}catch(NumberFormatException af)
		{
			System.out.println("test123"+af.getClass());			
			Assert.assertEquals(af.getClass(),"class java.lang.NumberFormatException");
		}
	}

}
