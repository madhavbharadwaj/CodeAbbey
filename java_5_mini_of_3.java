

import java.util.Scanner;
 
class java_5_mini_of_3
{
   public static void main(String args[])
   {
      //int m, n, c, d;
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter the Limit");
	  int l=s.nextInt();
	  
	  int[] a = new int[l];
	  int[] b = new int[l];
	  int[] c = new int[l];
	  
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
		System.out.println("Enter 3rd array elements :");
		for(int i=0;i<l;++i)
		{
			System.out.print("Enter Value of C["+ i + "] = ");
			c[i]=s.nextInt();
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
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  C["+ i + "] = "+c[i]+" , ");
			
		}
		
		System.out.println();
		
		int min=0;
		for(int i=0;i<l;++i)
		{
			if (a[i] > b[i])
			{
				min= b[i];
				
			}	
			else if (b[i] > c[i])
			{
				min= c[i];
			}
			else
				min= a[i];
			System.out.println(" Minimum of  A["+ i + "] , B[" + i +"] and C ["+ i +"]  = "+min);
		}
   }
}