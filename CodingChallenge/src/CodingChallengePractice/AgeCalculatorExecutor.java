package CodingChallengePractice;
import java.util.Scanner;

public class AgeCalculatorExecutor 
{
	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
			System.out.println(cy-by);
		else
			System.out.println((100-by)+cy);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Birth Year");
		int by=sc.nextInt();
		System.out.println("Enter Current Year");
		int cy=sc.nextInt();
		System.out.println("your Age is");
		ageCalculator(by,cy);
	}
	
}
