package mainPrograms;

import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		int arr[] = {8,2,9,5,6,4};
		int arr1[] = SortArray(arr); 
	  for(int i=0;i<arr1.length;i++)
	  {
		System.out.println(arr1[i]);
	  }
		
	}
	
	public static int[] SortArray(int arr[])
	{
	  Arrays.sort(arr);
	  return arr;
	}
}
