/* 
Problem : 31
http://www.codeabbey.com/index/task_view/rotate-string 

*/
import java.util.*;

class java_29
{
   public static void main(String args[])
   {
	   
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("Enter a String : ");
		str=s.next();
		
		
		System.out.print("Enter a position to rotate : ");
		int p=s.nextInt();
		
		String tempcut="";
		String tempremain = "";
		
		int len=str.length();
		
		if(p<0) //checking whether p is  negative or not
			{
				
				for(int i=0;i<Math.abs(len-(-p));i++) 
				{
					tempcut= tempcut + str.charAt(i);
				}
				System.out.println();
				
				for(int j=0;j<Math.abs(p);j++) //if input is '-6' verycomplex'number' to cut only 'number'
				{
					tempremain=  tempremain + str.charAt((Math.abs(len-(-p)))+j);
				}		
					
				
			}
			
		else
		{
				for(int i=0;i<p;i++)
				{
					
					tempcut=tempcut + str.charAt(i);	
				}
				System.out.println();

				for(int j=p;j<str.length();j++)
				{
					tempremain = tempremain + str.charAt(j);		
				}
				
		}
			
		System.out.println("From '"+str+"' '"+tempremain+"' (i,e from Position '"+p+"' ) is Moved and concatinated with '"+tempcut+"' "); 
		System.out.println("Hence the Final Output is : "+tempremain.concat(tempcut)); //concatinating according to output
   }	
		
	
}	
  