package testPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

import mainPrograms.CommonArray;
import mainPrograms.SubstringReplace;
import mainPrograms.SubstringReplace.*;

public class StringReplaceTest {

	@Test
	public void teststring()
			{
		 String s="Welcome To Magic Park";
		 String var1="Magic";
		 String var2="Jurassic";
		 String actual=SubstringReplace.SubStrReplace(s, var1, var2); 	
	Assert.assertEquals(actual,"Welcome To Jurassic Park" );
	}
	
	@Test
	public void teststring1()
			{
		 
	Assert.assertEquals(SubstringReplace.SubStrReplace("Welcome To Magic Park", "Magic","Dino and Jurassic"), "Welcome To Dino and Jurassic Park");
		
}

	/*@Test
	public void testblankstring()
			{
		 String s="Welcome To Magic Park";
		 String var1="Magic";
		 String var2="";
		 String actual=SubstringReplace.SubStrReplace(s, var1, var2); 	
	Assert.assertEquals(actual,"Welcome To    Park" );*/
	}


