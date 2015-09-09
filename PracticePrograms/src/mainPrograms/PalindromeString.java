package mainPrograms;

import java.util.Scanner;

public class PalindromeString {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
String original,reverse="";
Scanner sc=new Scanner(System.in);
System.out.println("enter the word");
original=sc.nextLine();
	
int length=original.length();

for(int i=length-1;i>=0;i--)
{
	reverse=reverse+original.charAt(i);
	System.out.println("printing the reverse word"+reverse);
}
	
System.out.println("printing the reverse word"+reverse);
	
if(original.equals(reverse))
	System.out.println("entered word is palindrome");
	else
	System.out.println("entered word is not palindrome");


}
}


