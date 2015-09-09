package mainPrograms;

public class CommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={11,2,3,5,10};
		int[] arr1={12,16,3,6,15};
		int cnum=commonNum(arr,arr1);
		System.out.println("Commmon num is :"+cnum);
		
		
	}
		
		
		public static int commonNum(int a[],int b[])
		{
			int num=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					num=b[j];
					//System.out.println("common num in array is :"+num);
				
				}
			}
		}
		return num;
	}

}
