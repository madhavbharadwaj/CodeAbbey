

import java.util.Scanner;
 
class java_6_maxi_of_array
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
		
		/*System.out.println("Enter 2nd array elements :");
	  
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
		*/
		System.out.println();
		
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  A["+ i + "] = "+a[i]+ ",");
			
		}
		/*System.out.println();
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  B["+ i + "] = "+b[i]+" , ");
			
		}
		System.out.println();
		for(int i=0;i<l;++i)
		{
			System.out.print(" Value  C["+ i + "] = "+c[i]+" , ");
			
		}*/
		
		System.out.println();
		
		int min=0;
		int max=0;
		int temp;
		for(int i=0;i<l;i++)
		{
			for(int j=1;j<l-i;j++)
			{
				if(a[j-1] > a[j])
				{
					temp =a[j-1];
					a[j-1] = a[j];
					a[j]=temp;
				}
			}
			//System.out.println("Sorted array" + a[i]);
			
			if (a[i] > a[l-i-1])
			{
				max= a[i];
				min=a[l-i-1];
			}	
			else 
			{
				max= a[l-i-1];
				min= a[i];
			}		
		}
			
		
		System.out.println(" Miximum of  Array "+max+"- Minimum of Array   = "+min);
   }
}