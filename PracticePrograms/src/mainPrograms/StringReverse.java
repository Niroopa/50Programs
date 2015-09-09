package mainPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String s = "BOJJI";
	 String s1 = StrReverse(s);
	 System.out.println(s1);
	}

	public static String StrReverse(String s)
	{
      int i = s.length();
      String s1="";
      for (int j=i-1;j>=0;j--)
      {
    	 s1 = s1+s.charAt(j);
      }
      return s1;
	}
}
