
import java.util.*;

class java_23_GCD_LCM
{
   public static void main(String args[])
   {
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter Value of X = ");
		int a=s.nextInt();
		System.out.print("Enter Value of Y = ");
		int b=s.nextInt();
		int lcma =a ;
		int lcmb =b ;
		int r;
				
		while(b!=0)
		{
			r = (a%b);
			a=b;
			b=r;
			
		}
			
			System.out.println("GCD = " +a);
			
			
			int lcm = (lcma * lcmb)/a;
				System.out.println("LCM = "+lcm);
		
		
   }	
	
}	
  