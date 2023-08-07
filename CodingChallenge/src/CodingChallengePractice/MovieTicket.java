package CodingChallengePractice;

import java.util.Scanner;

public class MovieTicket 
{
	

	public static void Test(int age, float time)
	{
		if(age>13) {
			if(time>=10.15 && time<=13.30)
			{
				System.out.println("$8.00");
				}
			else if(time>=18.00 && time<=22.00)
			{
				System.out.println("5.00");
				}
			}
		else if(age<13) {
			if(time>=10.15 && time<=13.30)
			{
				System.out.println("$4.00");
				}
			else if(time>=18.00 && time<=22.00)
			{
				System.out.println("$2.00");
				}
			}
		else
		{
			System.out.println("Enter the correct time");
			}
		}


	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

	Scanner sc= new Scanner(System.in);
	int age= sc.nextInt();
	float time= sc.nextFloat();
	Test(age,time);

	}
	

}