

import java.util.Scanner;

 
class java_8_Vowel Count
{
   public static void main(String args[])
   {
      
      Scanner s = new Scanner(System.in);
	  String[] str = new String[100];
	  
	 
	 System.out.print("How Many Strings you want to enter : ");
	 int n= s.nextInt();
	 int len=0;
	
	  for(int i=0;i<n;i++)
	  {
		System.out.print("Enter String ["+i+"] : ");
		str[i] = s.next();
	  }
	  System.out.println();
	  for(int i=0;i<n;i++)
	  {
		
		
		
		int count=0;
		  for(int j = 0 ; j < str[i].length()  ; j++)
		  {
			char ch = str[i].charAt(j);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y')	
			  {
				count++;  
			  }
			  
		  }
		  System.out.println();
		  System.out.println("String ["+i+"]: " +str[i]);
		  System.out.println("Length : "+str[i].length());
		  System.out.println("VOWEL : "+count);
		  
	  }	
	  
   }
}