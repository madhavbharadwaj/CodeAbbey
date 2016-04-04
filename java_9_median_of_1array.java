

import java.util.Scanner;

 
class java_9_median_of_1array
{
   public static void main(String args[])
   {
      
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter Limit");
	  int n = s.nextInt();
	  
	  int[] a1= new int[n];
	  
	  System.out.println("Enter 1st array Elements");
	  
		  for(int i=0;i<n;i++)
		  {
			System.out.print("Enter A ["+i+"] : ");
			a1[i] = s.nextInt();
		  }
		  
		  System.out.println();
		  
		  /* Sorting for Median */
		  for(int i=0;i<n;i++)
		  {
			int temp=0;
				for(int j=1;j<n-i;j++)
				{
					if(a1[j-1] > a1[j])
					{
						temp=a1[j-1];
						a1[j-1]=a1[j];
						a1[j]=temp;
					}
					
				}
				
		  }
		  System.out.println("Sorted Array Elements : ");
		  int sum = 0;
		  int med=0;
			for(int i=0;i<n;i++)
			{
				System.out.println(" A ["+i+"] : " + a1[i]);
				//sum = sum + a1[i];
				med=(n+1)/2;
				
			}
			System.out.println(a1[med-1]);
	 
	  
	 
	
	  
   }
}