package mainPrograms;
import java.lang.Exception;
public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] fib = FibNum(10);
     for(int i = 0; i<fib.length;i++)
     {
    	 System.out.println(fib[i]);
     } 	 
    }
		
	public static int[] FibNum(int num)
		{
			int sum=0,prev=0,next=1,n;
			int[] arr = new int[num];
			
			for(n=0;n<num;n++)
			{
	
				sum=sum+prev;
				arr[n]=sum;
				prev=next;
				next=sum;
//			 	 System.out.println(sum);
	        }
			
		
		return arr;
	}

}

