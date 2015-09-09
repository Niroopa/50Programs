package mainPrograms;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str;
        int n;
        System.out.println("enter num");
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		
		str=Ping(n);
		System.out.println(str);
	
	}		
	
		public static String Ping(int num)
		{
		String str=null;					
		if((num % 3==0)&&(num % 5==0))
		{
		str = "Ping Pong";	
		}else 
		if(num % 3==0)
		{
		  str ="Ping";
			
		}
		else
			if(num % 5 ==0)
			{
			str="Pong";
				
			}else
			{
				str="invalid num";
				//System.out.println("invalid num");
			}
		
		return str;	
		
		}

}
