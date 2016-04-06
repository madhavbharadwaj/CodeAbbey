
import java.util.*;

class java_31
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter Length 1 of Triangle : ");
		int a=s.nextInt();
		
		System.out.println();
		
		System.out.print("Enter Length 2 of Triangle : ");
		int b=s.nextInt();
		
		System.out.println();
		
		System.out.print("Enter Length 3(hypotenuse) of Triangle : ");
		int h=s.nextInt();
		
		h= h*h;
		int res= (a*a) + (b*b);
		
		String type="";
		
		if (h==res)
		{
			type="R";
		}
		
		else if (h < res)
		{
			type="A";
		}
		else
			type="O";

		
		System.out.println();
		System.out.print("Type of Triangle is : "+type);
   }	
   
		
	
}	
  