/*
 
 */
package CodingChallengePractice;
import java.util.Scanner;

public class MangoTree 
{
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1)
			System.out.println("Mango Tree");
		else
			System.out.println("Not a Mango Tree");
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of n:");
	int n =sc.nextInt();
	System.out.println("Enter the Value of t:");
	int t =sc.nextInt();
	isMangoTree(n,t);
	sc.close();
	
}
}
