package Operators;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		
		num2=sc.nextInt();
		
		num1 *= num2;
		
		System.out.println("updated value of num1 is: "+ num1);

	}

}
