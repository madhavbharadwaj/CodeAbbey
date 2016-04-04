
import java.util.*;


class java_13_complete_weighted_sum_of_digits
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		int len = Integer.toString(n).length();
		int newn= n;
		int sum=0;
		
		int[] rem = new int[100];
		int rems=0;
		while(n!=0)
		{
			for (int i =1;i<=len ; i++)
			{
				rem[i] = n % 10;
				System.out.println("wsd("+newn+") = " + rem[i] + " * "+(len-i+1)+ "= " +(rem[i])*(len-i+1));
				rems = rems + ((rem[i])*(len-i+1));
				n = n /10 ;	
			}

		}
		System.out.println("Weighted Sum of Digits "+rems);
		
		
	
   }	
}