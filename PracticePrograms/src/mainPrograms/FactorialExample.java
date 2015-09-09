package mainPrograms;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int no=Fact(8);
		System.out.println("num is"+no);
	}
		
		public static int Fact(int num)
		{
			int c,f=1;
			if(num<0)
			{
				System.out.println("should be non negative num");
				
			}else
				for(c=1;c<=num;c++)
				{
					f=f*c;
				
				}
			return f;
		}
	}


