package mainPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int  n=153;
     String s=Integer.toString(n);
     int sum=0,num,p;
     int length=s.length();
     char k;
     System.out.println(length);
     System.out.println(s);     
     for(int i=0;i<length;i++)//for loop for each char in the string 
     {
    	k=s.charAt(i);

        num=Character.getNumericValue(k);
    	p=1;
        System.out.println("s"+k);    	
        System.out.println("num"+num);    	
    	for(int j=0;j<length;j++)//this loop for multiplying number with itself according to the length of the num
    	{
    		p=p*num;
    		System.out.println("value is :"+p);
    	}
    	sum=sum+p;
    	System.out.println("value of full nums is:"+sum);
     }
     System.out.println(sum);
     if ( sum == n)
     {
    	System.out.println("Bahu(Arm)bali(strong):-)");
     }
		
		
	}

}
