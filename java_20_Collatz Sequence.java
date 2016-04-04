
import java.util.*;

class java_20_Collatz Sequence
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a Number to find Collatz Sequence and its Count : ");
		int xNext = s.nextInt();
		
		int flag=0;
		
			int nx=0;
			System.out.println("Collatz Sequence :");
			while(xNext != 1)
			{
				
				if(xNext%2==0)
				{
					flag=1;
					
				}
				
				
				else
				{
					flag=0;
					
				}
				
				
				System.out.println(xNext);
				nx++;
				
				if(flag==0)
				{
					xNext = (3 * xNext + 1);
					System.out.println(xNext);
					xNext=xNext/2;
					flag=1;
					nx++;
				}			
				
				else
				{
					xNext=xNext/2;
				}	
				
				
				
			}	
				
		
		
				System.out.println("Count Steps : " +nx);
		
   }	
  
}