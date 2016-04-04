

import java.util.Scanner;
 
class java_7_rounding
{
   public static void main(String args[])
   {
      //int m, n, c, d;
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter the Limit");
	  int l=s.nextInt();
	  
	  double[] a = new double[l];
	  double[] b = new double[l];
	  //int[] c = new int[l];
	  
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
		
		double div;
		int iPart; 
		double fPart; 
		for(int i=0;i<l;++i)
		{
			
			
			div=(a[i] / b[i]);
			iPart = (int) div;
			fPart = div - iPart;
			double d2=(a[i] % b[i]);
			int x;
			if (d2!= 0)
			{
				if(iPart < 0)
					
					x=iPart -1;	
				else
					x=iPart +1;	
				
			}
			else 
			{
				x=iPart;	
				
			}
			System.out.println(x);
			
		}
		
		
   }
}