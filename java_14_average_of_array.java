//This scumbag program took 7hrs
import java.util.*;


class java_14_average_of_array
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of an Array : ");
		int n = s.nextInt();
		System.out.println();
		int[]  a = new int[n];
		
		System.out.println("Enter " + n + " elements");
		
		for (int i =0;i<n;i++)
		{
			System.out.print("A["+i+"] = ");
			a[i]=s.nextInt();
		}
		System.out.println();
		double sum=0;
		for (int i =0;i<n;i++)
		{
			
			sum=sum + a[i];
		}
		
		double avg=(sum/n);

		int iPart;
		double fPart;
		iPart=(int)avg;
		fPart = avg - iPart;
		int totavg;
	
			if(fPart > 0.50)
				totavg = iPart + 1;
			else
				totavg = iPart;
			
		System.out.println("Average(rounded-off) = " +totavg);
	
   }	
}