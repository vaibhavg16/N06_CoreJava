package Operators;

import java.util.Scanner;

public class TernaryOprator // SYNTAX: (expression)?True:False
{

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("RESULT is: "+result);
	}

}
