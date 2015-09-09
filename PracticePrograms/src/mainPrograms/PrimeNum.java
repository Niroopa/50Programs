package mainPrograms;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("enter num");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		str=Prime(n);
		System.out.println(str);
	}
		public static String Prime(int num)
		{
			String str=null;
			int flag = 0;

				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						flag = 1;
					}
				}		
			    if (flag == 1)
					{
						str="Not Prime";
					}
					else
					{
						str="Prime";
					}
					
	
			
			return str;
		
			
		}
	}


