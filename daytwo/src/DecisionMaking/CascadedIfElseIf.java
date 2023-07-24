package DecisionMaking;

import java.util.Scanner;

public class CascadedIfElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age1=sc.nextInt();
		int age2=sc.nextInt();
		int age3=sc.nextInt();
		
		System.out.println("age 1 is:"+age1);
		System.out.println("age 2 is:"+age2);
		System.out.println("age 3 is:"+age3);
		
		if(age1>age2 && age1>age3)
		{
			System.out.println("age 1 is greater");
		}
		else if(age2>age3)
		{
			System.out.println("age 2 is greater");
		}
		else
		{
			System.out.println("age 3 is greater");
		}
		
		sc.close();

	}

}
