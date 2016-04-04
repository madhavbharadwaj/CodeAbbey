
import java.util.*;


class java_15_arthematic_progesstion
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		int n=0;
		System.out.println("Enter First Value of Sequence : ");
		
		int a = s.nextInt();
		
		
		System.out.println("Enter the Step Size ");
		
		int b = s.nextInt();
		
		System.out.println("Enter  value ");
		int c = s.nextInt();

		int y,sum=0;
		while(c!=n)
		{
			y=(a + (n * b));
			n++;
			sum = sum +y;
			//System.out.println(y);
		}
		System.out.println(sum);
		
	
   }	
}