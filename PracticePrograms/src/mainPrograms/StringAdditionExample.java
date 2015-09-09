package mainPrograms;

public class StringAdditionExample {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String Original="manishi antene manchodu";
	System.out.println(Original);
//	StringBuffer s=new StringBuffer();

	int length=Original.length();
	System.out.println("length of string"+length);
	int j;
	String add= "";

	String[] addition=Original.split(" ");

	for(int i=0;i<addition.length;i++)
	{
		
//	    s.append(addition[i]);
//	  	s.append(" ");
	  	j = i + 1;
//	  	System.out.println(j);
		add=add+addition[i]+j+" ";
//		s.append(" ");


	  
		
	}
	System.out.println(add); 


	//System.out.println(s.toString());
	//System.out.println("this"+1+ "  "+ "is"+2+"  "+"nice"+3);



		}


	}


