package mainPrograms;

public class ReverseAWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello every one";
		StringBuffer buffer=new StringBuffer(); //declaring the str variable using stringbuffer;
		
		
		String[] str1 =s.split(" ");// str[0]=hello,str[1]=every,str[2]=one;
		
		for(int i=str1.length-1;i>=0;i--)
		{
		buffer.append(str1[i]);
			System.out.println("print i value :" +str1[i]);
			
			buffer.append(" ");
			
			
		}
System.out.println("\n original string is:" +s);
System.out.println("\n reversed words are:" +buffer.toString());
	}

}
