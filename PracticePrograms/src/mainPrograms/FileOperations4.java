package mainPrograms;

import java.io.Console;
import java.io.IOException;

public class FileOperations4 {

	public static void main(String[] args)throws NullPointerException,IOException
	{
		// TODO Auto-generated method stub
		Console console = System.console();
		String s = console.readLine();
		System.out.println("enter num");
	try{
		int i = Integer.parseInt(console.readLine());
        System.out.println("enter num");
        int j=Integer.parseInt(console.readLine());
        int num=division(i,j);
        System.out.println("printing value:"+num);
	}
	catch(NullPointerException e)
	{
		System.out.println("exception");
	}
	}

	public static int division(int a,int b)
	{
		int c=a/b;
		return c;
	}
}
