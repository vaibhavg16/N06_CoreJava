// printing * program
package ControlStatement;
import java.util.Scanner;
public class for_loop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++)
		{   
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");   
			}
		System.out.println("");         // for going on new line
		}
		sc.close();	
	}
}
