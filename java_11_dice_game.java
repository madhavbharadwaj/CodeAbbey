

import java.util.*;


class java_11_dice_game
{
   public static void main(String args[])
   {
     // Scanner s = new Scanner(System.in);
	  Random r = new Random();
	  
		  
		  
		  for(int i=0;i<6;i++)
		  {
			  double x=r.nextFloat();
			  //System.out.println(x);
			   double a = (x * 6) + 1;
			   int b= (int) a;
			   //System.out.println(b);
			   
			   System.out.println("Occurance : "+x + "=" +b);
		  }
	 
	  
   }	
}