package mainPrograms;

import java.util.GregorianCalendar;

public class GarbageExample extends GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		GarbageExample ge=new GarbageExample();
		System.out.println("printing current time"+ge.getTime());
		System.out.println("using finalize method()");
		ge.finalize();
		System.out.println("used finalized on object ge"+ge);	
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught:"+e.getMessage());
		}
		
		
	}

}
