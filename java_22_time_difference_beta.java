//halfy completed
import java.util.*;

class java_22_time_difference_beta
{
   public static void main(String args[])
   {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[100];
		int[] b = new int[100];
		
		System.out.println("Enter Start Date (dd,hh,mm,ss) ");
		System.out.println();
		for(int i = 0 ;i < 4;i++)
		{
			
			System.out.print("Enter (dd,hh,mm,ss) ["+i+"] =");
			a[i] = s.nextInt();
			
			
			
		}
		System.out.println();
		System.out.println("Enter End Date (dd,hh,mm,ss) ");
		
		for(int i = 0 ;i < 4;i++)
		{
			
			System.out.print("Enter (dd,hh,mm,ss) ["+i+"] =");
			b[i] = s.nextInt();
			
			
			
		}
		int[] diff = new int[100];
		System.out.println();
		for(int i = 0 ;i < 4;i++)
		{
			
			diff[i] = b[i] - a[i];
		//	System.out.print(diff[i]);
			
			
		}
		
			int x=b[1]-a[1];
			int y=b[3]-a[3];

			if(diff[2] < 0 && x==1 )
			{
				diff[2] =  60- (a[2] - b[2]);
				diff[1]--;
				
				
			}
			else if(diff[3] < 0)
			{
				
				diff[3] = 60 + y;
				diff[2]--;
				
			}
				System.out.println(diff[0]);
				System.out.println(diff[1]);
				System.out.println(diff[2]);
				System.out.println(diff[3]);
			
   }	
		
		
	
		
		
		
		
	
}	
  