package mainPrograms;

import java.util.Scanner;

public class ParanthesisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1=" ";
   //  String a="";
     Scanner in=new Scanner(System.in);
    System.out.println("enter the word");
 String	a=in.nextLine();
   s1=Paran(a);
   System.out.println("printing string"+s1);
    
	}

	
	public static String Paran(String s)
	{
		String[] a=new String[100];
		String[] b=new String[100];
		int k=0,l=0;
		char m='(';
		char n=')';
	//	char p=' ';
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==m)
			{
				a[k]="(";
				k++;
			}
		   if(s.charAt(i)==n)
		   {
			   b[l]=")";
			   l++;
		   }
	//System.out.println("printing length of a:"+a.length);
	//	System.out.println("printing length of b:"+b.length);
		   if(k==l)
		   {
			  str="balanced";
		   }
			  else
			  {
				str="not balanced";
		   }
		
		}
	
	
	
	return str;
	
}
}
