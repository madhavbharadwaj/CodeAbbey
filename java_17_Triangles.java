
import java.util.*;


class java_17_Triangles
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		
		
		System.out.print("Enter Side A Length : ");
		
		int a = s.nextInt();
		
		System.out.print("Enter Side B Length : ");
		int b = s.nextInt();
		
		System.out.print("Enter Side C Length : ");
		int c = s.nextInt();
			
		int flag=1;
		
		if (((a+b) > c) && ((a+c) > b) && ((b+c) > a))
		{
			flag=0;
		}
		else 
			flag=1;
		
		
		if(flag==1)
			System.out.println("Result : 0 ( Its Cannot be a Triangle)");
		else
			System.out.println("Result : 1 (It can be a Triangle)");
   }	
}