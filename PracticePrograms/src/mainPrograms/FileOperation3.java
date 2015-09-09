package mainPrograms;

import java.io.DataInputStream;
import java.io.IOException;

public class FileOperation3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("enter num");
		String s=dis.readLine();
		int i=Integer.parseInt(s);
		System.out.println("enter num");
		String k=dis.readLine();
		int j=Integer.parseInt(k);
		//int j=dis.readInt();
		int num=multiply(i,j);
		System.out.println("print value:"+num);
	}

	public static int multiply(int a,int b)
	{
		int c=0;
		c=a*b;
		return c;
	}
}
