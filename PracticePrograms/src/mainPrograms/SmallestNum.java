package mainPrograms;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={10,20,12,9,15};
int min=findSmallest(arr);
System.out.println("print smallest num:"+min);



	}

	public static int findSmallest(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				
			}
		}
	return min;	
	
}
}

