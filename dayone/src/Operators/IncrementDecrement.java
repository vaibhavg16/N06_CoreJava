package Operators;

import java.util.Scanner;

public class IncrementDecrement 

{

	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	    int res1 = x++ + ++y;
	    System.out.println("x="+x);
		System.out.println("RESULT for is: "+res1);
        System.out.println("_________________________________________");
		int res2 = x-- + --y;
	    System.out.println("x="+x);
		System.out.println("RESULT for is: "+res2);
	}

}
