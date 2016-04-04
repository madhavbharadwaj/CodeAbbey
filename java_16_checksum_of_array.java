
import java.util.*;


class java_16_checksum_of_array
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
		int seed=113;
		int limit=10000007;
		int result=0;
		int limitlen = Integer.toString(limit).length();
		
		int[] a=new int[100];
		System.out.println("Limit Length  : " +limitlen);
		for(int i=0;i<6;i++)
		{
			System.out.print("A ["+ i + "] = ");
			a[i] = s.nextInt();
			
		}
		
		int[] resultlen= new int[100];
		System.out.println();
		for(int i=0;i<6;i++)
		{
			result = (result + a[i]) * seed ; 
			resultlen[i] = Integer.toString(result).length();			
	
			if (resultlen[i] >= (limitlen))
			{
				result = (result%10000007);
	
			}
		
		}
		System.out.println("Final Result = "+result);
   }	
}