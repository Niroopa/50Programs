package mainPrograms;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9};
		
		int arr3[] = MergeArr(arr1,arr2);
		for(int i=0;i<arr3.length;i++)
		{
		  System.out.println(arr3[i]);
		}
   }

	public static int[] MergeArr(int arr1[],int arr2[])
	{
      int a = arr1.length;
      int b = arr2.length;
      int c=a+b;
      int d=0;
      int arr3[] = new int[c];
      for(int i=0;i<a;i++)
      {
     	arr3[i]=arr1[i];
      }      
      for(int j=0;j<arr2.length;j++)
      {
    	d=a+j;
    	arr3[d]=arr2[j];
      }
      return arr3;
	}
}
