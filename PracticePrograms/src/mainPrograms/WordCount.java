package mainPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
//	public  static int countingWordsFromFile(String filepath)
	//{
		int count=0;
		String line=" ";
		
		BufferedReader buff=null;
		try{
			buff=new BufferedReader(new FileReader(//C:\ProgramExamples\sample.txt));
			while((line=buff.readLine())!=null)
			{
				System.out.println(line);
				count++;
				String word[]=line.split(" ");
				for(int i=0;i<=line.length();i++)
			{
					if(word[i])
				}
			}
			
		}catch(FileNotFoundException fe)
		{
			System.out.println("file not found");
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}
		
		if(buff!=null)
		{
			try{
				buff.close();
			}
			catch(IOException ei)
			{
				System.out.println("exception");
			}
		}
		
	}

	}


