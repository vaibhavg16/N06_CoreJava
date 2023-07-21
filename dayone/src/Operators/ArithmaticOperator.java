package Operators;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition is " +(num1+num2));
		System.out.println("Substraction is "+ (num1 - num2));
		System.out.println("Substraction is "+ (num1/num2));
		System.out.println("Substraction is "+ (num1*num2));
		System.out.println("Substraction is "+ (num1%num2));
		sc.close();
	}

}
