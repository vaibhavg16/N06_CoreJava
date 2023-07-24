package DecisionMaking;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter your Weight:");
		int weight=sc.nextInt();
		
		System.out.println("your age is:"+age);
		System.out.println("your weight is:"+weight);
		
		if(age>=18 && weight>=50)
		{
			System.out.println("Eligible for blood donation");
		}
		else
		{
			System.out.println("Not Eligible for blood Donation");
		}
		
		sc.close();
		

	}

}
