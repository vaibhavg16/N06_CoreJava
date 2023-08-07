/*
A microwave oven manufacturer recommends the following heating times for atoms:
When heating one item, use the regular heating time.
When heating two item, increase the heating time by 50%.
When heating three item, double the heating time.
Heating more than three item at once is not recommended.
Write a program to calculate the recommended heating time based on the number of atoms to be heated.
*/
package CodingChallengePractice;
import java.util.Scanner;
public class microwave 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the item no:");
		int item=sc.nextInt();

		System.out.println("Enter the heating time:");
		double heattime=sc.nextDouble();
		
		if(item==1)
		{
			System.out.println("Regular heat is:"+heattime);
		}
		else if(item==2)
		{
			System.out.println("Heating Time increased by:"+(heattime+0.5d));
		}
		else if(item==3)
		{
			System.out.println("Heating Time is doubled"+(heattime*heattime));
		}
		else if(item>3)
		{
			System.out.println("Heating more than three atoms at once is not recommended");
		}	
		sc.close();		
	}
}
