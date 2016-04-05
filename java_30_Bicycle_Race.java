
import java.util.*;

class java_30
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter Distance between 2 Cities : ");
		double d=s.nextDouble();
		
		System.out.println();
		
		System.out.print("Enter the Speed(km/h) of Bicyclist 1 : ");
		double b1=s.nextDouble();
		
		System.out.println();
		System.out.print("Enter the Speed(km/h) of Bicyclist 2 : ");
		double b2=s.nextDouble();
		
		
		double res= (d/(b1+b2));
		
		
		System.out.println("Distance travelled by Bicyclist 1 before they meet : "+res);
		
   }	
		
	
}	
  