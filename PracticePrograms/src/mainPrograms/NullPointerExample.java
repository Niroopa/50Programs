package mainPrograms;

public class NullPointerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Object o=null;
String s=null;
String str="x";
try{
	System.out.println("String length:"+s.length());
	System.out.println("printing value of o"+o.hashCode());
    System.out.println("comapring string"+s.equals(str));
    System.out.println("comparing with known value " + str.equals(s));
	
}catch(NullPointerException ne)
{
	ne.printStackTrace();
	
}
	catch(Exception e)
{
		System.out.println("Main exception"+e);
	
	}finally{
		 System.out.println("comparing with known value"+str.equals(s));
			
		System.out.println("The program ends");
	}
	}
	
	}


	


