package mainPrograms;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={20,98,55,34,16};
		int max=Largest(arr);
		System.out.println("largest num:"+max);
	}

	
	public static int Largest(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
		}
		return max;
	}
	
}
