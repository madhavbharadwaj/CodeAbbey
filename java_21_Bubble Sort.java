
import java.util.*;

class java_21_Bubble Sort
{
   public static void main(String args[])
   {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[100];
		System.out.print("Enter the Array Limit : ");
		int n = s.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print("A ["+i+"] ="  );
			a[i] = s.nextInt();
		}
		int s1=0,p=0;
		for(int i=0;i<n;i++)
		{
			int temp;
			for(int j=1;j<n;j++)
			{
				
				if(a[j-1] > a[j])
				{
					
					temp=a[j-1];
					s1++;
					a[j-1]=a[j];
					a[j] = temp;
					
					
				}	
				
				
				
			}
			
			
		}
		
		
	
		System.out.println("Number of Swaps : "+s1);
		
		
		
	
   }	
  
}