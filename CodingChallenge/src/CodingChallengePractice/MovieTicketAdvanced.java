package CodingChallengePractice;

import java.util.Scanner;

public class MovieTicketAdvanced 
{static void ticket(int age,float st)
	{
		//adult
		if(age>13)
		{
			if(st>=13.30 && st<=17.59)
				System.out.println("$5.00");
			else
				System.out.println("$8.00");
		}
		//children
		else
		{
			if(st>=13.30 && st<=17.59)
				System.out.println("$2.00");
			else
				System.out.println("$4.00");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		System.out.println("Enter Timing");
		float ti=sc.nextFloat();
		ticket(age,ti);
		sc.close();
	}

}
