package DecisionMaking;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the song no.");
		
		int songno=sc.nextInt();
			switch(songno)
			{
			case 1:
				System.out.println("waka waka shakira");
				break;
			case 2:
				System.out.println("Bajrang Bali");
				break;
			case 3:
				System.out.println("Jai Shree Ram");
				break;
			case 4:
				System.out.println("waka waka shakira");
				break;
			default:
				System.out.println("Invalid Choice");
			}
sc.close();
	}

}
