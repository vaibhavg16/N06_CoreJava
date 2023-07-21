package Operators;

import java.util.Scanner;

public class LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Scanner sc=new Scanner(System.in);
		
		System.out.println(51!=8 && 3>5); //and
		System.out.println(51!=8 || 3>5); //or
		System.out.println(!(51!=8 || 3>5)); //negation
		sc.close();

	}

}
