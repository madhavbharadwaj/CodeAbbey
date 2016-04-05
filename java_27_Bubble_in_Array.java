
import java.util.*;

class java_27
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		int[]  a = new int[100];
		int[]  b = new int[100];
		
		System.out.print("Enter Array Limit : ");
		int n = s.nextInt();
		
		
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++)
		{
			System.out.print("A["+i+"] = ");
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		
		int temp=0,count=0;
		System.out.println("Sorted Array Elements");
		for(int i=0;i<n;i++)
		{	
			for(int j=1;j<n;j++)
			{
				if(a[j-1]>a[j])
				{
					count++;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<n;i++)	
		{
			
			System.out.println("A["+i+"] = "+a[i]);
			
		}
		System.out.println("Swaps Made : "+count);
		
			
		int result=0,seed=113,limit=10000007;
		
		for(int i=0;i<n;i++)
			
			{
			
				result = (result + a[i])* seed;
				if(result>=limit)
				{
					result = result%limit;
				}

				
			}
		System.out.println("Check Sum : "+result);
	
   }
	
}	
  