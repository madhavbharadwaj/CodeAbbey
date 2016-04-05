
import java.util.*;

class java_26_pallindrome
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String to reverse : ");
		String s1= s.next();
		
		String y="";
		System.out.println("Original String : "+s1);
		
		int len=s1.length();
		//System.out.print(len);
		
		for(int i=0;i<len;i++)
		{
			y = y + s1.charAt(len-i-1);
				
		}
		
		System.out.println("Reversed String : "+y);
		
		if(y.equals(s1))
		{
			System.out.print("Pallindrome Status : Y");
		}
		else
			System.out.print("Pallindrome Status : N");
		
		

   }
	
}	
  