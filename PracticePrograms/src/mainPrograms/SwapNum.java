package mainPrograms;

public class SwapNum {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,4};
		int val1 = 5;
		int val2 = 4;
		int arr1[] = SwapNumber(arr,val1,val2); 
	  for(int i=0;i<arr1.length;i++)
	  {
		System.out.println(arr1[i]);
	  }
		
	}

	public static int[] SwapNumber(int arr[],int val1,int val2)
	{
     int a=-1,b=-1;
	 for(int i=0;i<arr.length;i++)
	 {
	   if(arr[i]==val1)
		 a=i;
	   System.out.println("a is:"+a);
	   if(arr[i]==val2)
		 b=i;
	 }
	 if(a!=-1&&b!=-1)
	 {
		 arr[a]=val2;
		 arr[b]=val1;
	 }
	 return arr;
	}
}
