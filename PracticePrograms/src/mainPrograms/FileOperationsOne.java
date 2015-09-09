package mainPrograms;

import java.util.Scanner;

public class FileOperationsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num1=0,num2=0,num=0;
		System.out.println("enetr the num1");
		Scanner scan=new Scanner(System.in);
	    num1=scan.nextInt();
		System.out.println("enter the num2");
		num2=scan.nextInt();
	//	int a1=0,b1=0;
		num=addition(num1,num2);
		System.out.println("printing sum:"+num);
		
	}
	
	public static int addition(int a1,int b1)
	{
//	a1=0;
	//b1=0;
		int c=0;
		c=a1+b1;
		return c;
		
		
	}
	
}



