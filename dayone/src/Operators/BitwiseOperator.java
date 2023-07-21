package Operators;

import java.util.Scanner;

public class BitwiseOperator // & , | , ^ , >> , <<
{

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		y=sc.nextInt();
			
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		
		System.out.println(3<<1); //left Double it depend on value y
		System.out.println(3>>1); //right Half it depend on value y
		
		sc.close();
	}

}
