
import java.util.*;


class java_12_sum_of_digits
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
	  
	  System.out.print("Enter Array Limit : ");
	  int n = s.nextInt();
	  
	  int[] a = new int[100];
	  int[] b = new int[100];
	  int[] c = new int[100];
	  System.out.println();
		System.out.println("Enter 1st Array Elements : ");
		for(int i = 0;i<n;i++)
			{
				System.out.print("Enter A["+i+"] :");
				a[i]=s.nextInt();
			}
		System.out.println();	
		System.out.println("Enter 2nd Array Elements : ");
		for(int i = 0;i<n;i++)
			{
				System.out.print("Enter B["+i+"] :");
				b[i]=s.nextInt();
			}
		System.out.println();
		System.out.println("Enter 3rd Array Elements : ");
		for(int i = 0;i<n;i++)
			{
				System.out.print("Enter C["+i+"] :");
				c[i]=s.nextInt();
			}
			
		int calc=0;
		for(int i=0;i<n;i++)
			{
				calc = (a[i] * b[i]) + c[i];
				//System.out.println(calc);
				int sum=0,rem=0;
				
				while(calc!=0)
				{
					rem= calc % 10;
					calc = calc / 10;
					sum = sum + rem;
				}
				System.out.println(sum);
				
				
			}
		
		
	
   }	
}