package mainPrograms;

public class SubstringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "THIS IS THE OLD ERA";
		 String s1 = "OLD ERA";
		 String s2 = "NEW AGE";
		 String s3 = SubStrReplace(s,s1,s2);
		 System.out.println(s3);		
	}

	public static String SubStrReplace(String s,String s1, String s2)
	{
		String s3 = s.replaceAll(s1,s2);
		return s3;
	}
}
