
import java.util.*;

class java_28
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter A Value to find Square Root : ");
		int n = s.nextInt();
		
		System.out.print("Enter Calculation Steps :  ");
		int c = s.nextInt();
		
		double r=1;
		double d=0;
		
		double abs=0;
		int flag=0;
		int count=0;
		while(flag!=1 && count!=c)
		{
			d=(n/r);
			abs=Math.abs(r-d);
			
			if(abs < 1)
			{
				flag=1;
				
			}
			r=(r+d)/2;
			count++;
		}
			
		System.out.print("Square Root of "+n+" is  "+r);
   }	
		
	
}	
  