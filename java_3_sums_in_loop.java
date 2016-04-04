

import java.util.Scanner;
 
class java_3_sums_in_loop
{
   public static void main(String args[])
   {
      //int m, n, c, d;
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter the Limit");
	  int l=s.nextInt();
	  
	  int[] a = new int[l];
	  int[] b = new int[l];
	  
	  System.out.println("Enter 1st array elements :");
	  
		for(int i=0;i<l;++i)
		{
			System.out.print("Enter Value of A["+ i + "] = ");
			a[i]=s.nextInt();		
		}
		
		System.out.println("Enter 2nd array elements :");
	  
		for(int i=0;i<l;++i)
		{
			System.out.print("Enter Value of B["+ i + "] = ");
			b[i]=s.nextInt();
		}
		System.out.println();
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  A["+ i + "] = "+a[i]+ ",");
			
		}
		System.out.println();
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  B["+ i + "] = "+b[i]+" , ");
			
		}
		
		System.out.println();
		int sum=0;
		for(int i=0;i<l;++i)
		{
			sum=a[i] + b[i];
			System.out.println(" Sum of  A["+ i + "] + B[" + i +"] = "+sum);
			
		}
   }
}