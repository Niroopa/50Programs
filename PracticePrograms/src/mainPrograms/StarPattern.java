package mainPrograms;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n;
	        System.out.println("enter num");
			Scanner in =new Scanner(System.in);
			n=in.nextInt();
			star(n);
		    	
		
	}
	
		
		public static void star(int num)
		{
			
		for(int i=0;i<num;i++)
		{
			System.out.println(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			
					
		}
		
	}

}
