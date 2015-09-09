package mainPrograms;

import java.util.Scanner;

public class HashandEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="";
		String b="";
		String c="";
		String d="";
		a="happy";
		b="happy";
		String s="";
		s=HashSearch(a,b);
	
		if(s=="x")
		{
			System.out.println("Printing hash memory location a"+a.hashCode());
			System.out.println("Printing hash memory location b"+b.hashCode());
           		
		}
		else
		{
			System.out.println("Not Same Location"+a.hashCode());
			System.out.println("Not same Location"+b.hashCode());
			}
		
	
		c="Banana";
		d="Banana";
		String str=equalSame(c,d);
		
		if(str=="x")
		{
			System.out.println("Printing equals method value:"+c.equals(d));
		}else
		{
			System.out.println(c.equals(d));
		}
		
	}
	
	public static String HashSearch(String a,String b)
	{
	String s="";	
	if( a == b)
	{
		s="x";
		}
		return s;
		
	}

	public static String equalSame(String c,String d)
	{
		String str="";
		if( c == d)
		{
			System.out.println("test");
			str="x";
		}
		return str;
	}
}
