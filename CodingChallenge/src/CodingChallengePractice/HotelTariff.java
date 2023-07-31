/* Write a program to calculate the hotel budget. 
 * The room rates are 20 percent higher during the peak seasons, 
 * which are from April to June and November to December. 
 * Given the number of the month (1 to 12), the rent for a regular day, 
 * and the number of days staying, calculate the total budget.*/
package CodingChallengePractice;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month");
		int month =sc.nextInt();
		float hoteltariff=0;
		System.out.println("Enter Rent");
		float rent=sc.nextInt();
		System.out.println("Enter Days");
		int days=sc.nextInt();
		switch(month)
		{
		case 1:	
		case 2:
		case 3:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println(rent+(rent*0.2f)*days);
			break;
			default:
				System.out.println("invaild");
		}
		
			sc.close();
		
	}

}
