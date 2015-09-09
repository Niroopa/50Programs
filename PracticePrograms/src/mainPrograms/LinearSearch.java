package mainPrograms;

import java.util.Arrays;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {50,60,10,5,80};
		int val = 100;
		int a = LinSearch(arr,val); 
		if (a==-1)
		{ 		
    	  System.out.println("Not Found");
		}
        else  
		{
  	      System.out.println("Found " +arr[a]+" at position "+a);  
		}  	      
	}

	public static int LinSearch(int arr[],int val)
	{
      int b=-1;
      Arrays.sort(arr);
      int c = arr.length;
      for (int i=0;i<c;i++)
      {
    	if( arr[i] == val )
    	{
    	  b = i;
    	  break;
     	}
      }
      return b;
	}
}
