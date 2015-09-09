package mainPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		 int[] arr={5,3,1,4,6};
		System.out.print("enter num to find");
	Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int no=sorting(arr, n);
		if ( no==0 )
	      System.out.println("num is not present"+no);
		else
		  System.out.println("num is present"+no);

	}
	public static int sorting(int[] arr, int m)
	{
		
     Arrays.sort(arr);
   

		int no=0;

		for(int j=0;j<arr.length;j++)
		{
//			 System.out.println(arr[j]);
			 if (m < arr[j] )
			 {
			 break;
			 }
			 if ( m==arr[j] )
			 {
			    no=arr[j];
			    break;
			 }
				
		}
		return no;
		}
	
}
