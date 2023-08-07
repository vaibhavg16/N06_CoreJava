/* Write a program to calculate the hotel budget. 
 * The room rates are 20 percent higher during the peak seasons, 
 * which are from April to June and November to December. 
 * Given the number of the month (1 to 12), the rent for a regular day, 
 * and the number of days staying, calculate the total budget.*/

package CodingChallengePractice;
import java.util.Scanner;
public class HotelTariff 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of the Month (1-12)");
		int month =sc.nextInt();
		System.out.println("Enter Rent for Regular day");
		float rent=sc.nextInt();
		System.out.println("Enter the Number of days Staying");
		int days=sc.nextInt();
		switch(month)
		{
		
		case 1:	
		case 2:
		case 3:
			System.out.println("Its Not Peak Seasons: January to March");
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Its Peak Seasons: April to June ");
			System.out.println("Rent is:"+rent+(rent*0.2f)*days);
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Its Not Peak Seasons: July to October");
			System.out.println(rent*days);
			break;
		case 11:
		case 12:
			System.out.println("Peak Seasons: November To December ");
			System.out.println("Rent is:"+rent+(rent*0.2f)*days);
			break;
			default:
				System.out.println("invaild");
		}
			sc.close();	
	}
}