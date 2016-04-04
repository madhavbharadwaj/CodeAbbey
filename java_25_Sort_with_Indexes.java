
import java.util.*;

class java_25_Sort_with_Indexes
{
   public static void main(String args[])
   {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Array Limit : ");
		int n = s.nextInt();
		
		System.out.println("Enter "+ n +" elements : ");
		int[] a = new int[100];
		int[] a1 = new int[100];
		int[] pos=new int[100];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("A ["+(i+1)+"] = ");
			a[i]=s.nextInt();
		}
		
		System.out.println("Original Array Elements : ");
		{
			for(int i=0;i<n;i++)
			{	
				
				System.out.println("A ["+(i+1)+"] = "+a[i]);
				pos[i] = i;
				a1[i] = a[i];	
			}
		}
		
		
		System.out.println("Sort with Indexes : ");
		int t=0,t1=0;
		
		for(int i=0;i<n;i++)
		{	
			
			
			for(int j=1;j<n;j++)
			{
				
				if(a[pos[j-1]] > a[pos[j]])
				{
					
					
					t=pos[j-1]; //t is for index
					t1=a1[j-1]; //t1 is for array value
					
					
					pos[j-1]=pos[j];
					a1[j-1]=a1[j]; 
					
		
					pos[j]=t;
					a1[j] = t1;
				
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a1[i]+" was at Position "+(pos[i]+1)+ " Initially");
		}
		

		

   }
	
}	
  