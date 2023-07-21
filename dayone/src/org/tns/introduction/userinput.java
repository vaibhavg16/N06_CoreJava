//user input demonstration
package org.tns.introduction;
import java.util.Scanner;
public class userinput 
{	
	public static void main(String[] args) 
	{   
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string 1");
		String str1=sc.next();
		System.out.println("String 1 is:"+str1);
		
		System.out.println("Enter a string 2");
		String str2=sc.nextLine();
		System.out.println("String 2 is:"+str2);
		sc.close();		
	}
}
