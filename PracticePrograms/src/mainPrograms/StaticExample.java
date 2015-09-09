package mainPrograms;

public class StaticExample {

	static{
		System.out.println("This is first static block");//prints first
	}
		
	public StaticExample()
	{
		System.out.println("This is constructor");//prints when the class is loaded into the jvm 
	}
	
	//static variable
	
	static String ste="Static Variable";

	static{
		System.out.println("this is second static block" +"and printing variable" + ste);//prints second
	}
	
	
	public static void main(String[] args) {
		
		StaticExample s=new StaticExample();
		s.staticMethod1();//prints 4th in order
		
	}
	
	public void staticMethod1()
	{
		System.out.println("this is static method");
	
	}

	static{
		staticMethod2();
		System.out.println("this is third static block");//prints third inorder
	}
		
		public static void staticMethod2()
			{
			System.out.println("this is second static method");
	
		}
	}

