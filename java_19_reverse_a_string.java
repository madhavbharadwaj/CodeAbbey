
import java.util.*;

class java_19_reverse_a_string
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a String to reverse : ");
		String str= s.next();
		
		String rev="";
		System.out.println("Original String : "+str);
		
		int len=str.length();
		
		System.out.println("String Length : "+len);
		
		
		for(int i=len-1;i>=0;i--)
		{
			
				rev= rev + str.charAt(i);

		}
		System.out.print("Reversed String : "+rev);
		
		
		
   }	
  
}