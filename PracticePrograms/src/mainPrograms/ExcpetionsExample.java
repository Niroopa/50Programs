package mainPrograms;

public class ExcpetionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int ab;
	int a=0;
	try{
		
			ab=child(a);
			System.out.println(a);
			System.out.println("ab value"+ab);
			
		}catch(ArrayIndexOutOfBoundsException ne)
	{
	        System.out.println(ne.toString());
			System.out.println("Caught ArrayOutOfBounds Exception");
			
	}
    String s="happy";
    int b=0; 
	try
	{
		b=child1(s);
//		System.out.println("b is:"+b);
		
	}catch(NumberFormatException ne)
	{
        System.out.println(ne.getMessage());
		System.out.println("Number Format Exception");
			
	}	
	}
	
	public static int child(int a)throws ArrayIndexOutOfBoundsException
	{
		int[] arr1={12,11,10};
		arr1[3]=a;
			
		return a;
	}
	public static int child1(String a)throws NumberFormatException
	{
		int a1=Integer.parseInt(a);
						
		return a1;
	}

}
