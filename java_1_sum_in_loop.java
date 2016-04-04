import java.util.Scanner;


class java_1_sum_in_loop
{

	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
		
		
		
		/*int[] arr = new int[];
		int arr[] = { 1 , 2 , 4 };
		
		System.out.println(arr[0] +  arr[1] + arr[2]);*/
		
		System.out.println("Enter the limit:");
		int n =s.nextInt();
		
		
		int[] a  = new int[n];
		
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++)
			{
				a[i]= s.nextInt();
				
			}
			
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		/*for(int x:a)
		{
			sum=sum+x;
		}*/
			System.out.println(sum);
	}
		
		

}	