
import java.util.*;

class java_24_Fibonacci Sequence
{
   public static void main(String args[])
   {
		Scanner s = new Scanner(System.in);
		
		int fib0=0;
		int fib1=1;
		int[] t=new int[100];
		
		System.out.println("Fibonacci Series Given :");
		//Prints Fibonacci till 100
		for(int i=0;i<100;i++)
		{
			System.out.println("F ["+i+"] = "+fib0);
			t[i]=fib0 +fib1;
			fib0=fib1;
			fib1=t[i];
		}
		System.out.println();
		System.out.print("Enter the Fibonacci Value : ");
		int f= s.nextInt();
		
		if(f==0)
			{
				System.out.print("Result : "+f+" found in F["+0+"].");
			}
		
		for(int i=0;i<100;i++) 
		{
			if(f==t[i])
			{
				System.out.print("Result : "+f+" found in F["+(i+2)+"]."); //because fib0 and fib1 are already initialised
			}	
		}

   }
	
}	
  