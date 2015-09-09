package mainPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperation2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String s=br.readLine();
		System.out.println("enter num1");
	try{
		int i = Integer.parseInt(br.readLine());
	    System.out.println("enter num2");
		int j=Integer.parseInt(br.readLine());
		int num=subtraction(i,j);
		System.out.println("print sub"+num);
	}catch(NumberFormatException ne)
	{
		System.out.println("exception");
	}
		
	}

	public static int subtraction(int a,int b)
	{
		int c=0;
		c=a-b;
		return c;
	}
}
