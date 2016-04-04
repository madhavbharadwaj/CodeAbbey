

import java.util.Scanner;

 
class java_10_bmi
{
   public static void main(String args[])
   {
      
      Scanner s = new Scanner(System.in);
	  double w,h;
	  System.out.print("Enter your weight in (kilograms) :");
	  w=s.nextDouble();
	  System.out.print("Enter your height in (meters) :");
	  h=s.nextDouble();
	  //Double pow = new Double();
	  
	  double h2=Math.pow(h,2);
	  
	  double bmi=(w/h2);
	
	  System.out.println();
	  System.out.println("Your Body Mass Index (BMI) is  : "+bmi);
	  String status;
	  if(bmi < 18.5 )
		  status="Underweight";
	  
	  else if (bmi <=24.9 || bmi <= 18.4)
		  status="Perfect !! Your Weight is Normal";
	  
	  else if (bmi <=30.0 || bmi <= 25.0)
		   status="Your Belly is FAT ";
	   else
		   status="Skinny";
	   
	   System.out.println("Final Status : " +status);
   }	
}