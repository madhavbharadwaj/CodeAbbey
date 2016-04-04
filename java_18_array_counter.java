
import java.util.*;

class java_18_array_counter
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		int[] a= new int [100];
		System.out.print("How many Elements : ");
		int n = s.nextInt();
		
		System.out.print("How the number limit : ");
		int m = s.nextInt();
		
		System.out.println();
		int[] pos = new int[100];
		int i;
		
		//accepting and checking the number limit
		System.out.println("Enter "+ n +" Elements from ( 1 to "+m+" )");	
		for(i = 0 ; i < n ; i++)
		{
			System.out.print(" A  ["+i+"] = ");
			a[i] = s.nextInt();	
			
			while(a[i] > m)
			{
				System.out.println("Number Limit Exceeded ! Please Try Again");
				System.out.print(" A  ["+i+"] = ");
				a[i] = s.nextInt();	
			}
			
			
		}
				System.out.println();	
		//checking number of 1s 2s and so on
		for( i = 0 ; i < n ; i++)
			{
				for(int j = 1 ; j <=n ; j++)
				{
					
					if (a[i]==j)
					pos[j]++;
				}
				
			}
			
		//printing number of i value 	
		for( i = 1 ; i <= m ; i++)
			{	
					System.out.println("Number of "+i+"(s) are "+pos[i]);
			}	

   }	
  
}