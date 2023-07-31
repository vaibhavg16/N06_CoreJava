
/*A microwave oven manufacturer recommends the following heating times for atoms:

When heating one atom, use the regular heating time.
When heating two atoms, increase the heating time by 50%.
When heating three atoms, double the heating time.
Heating more than three atoms at once is not recommended.
Write a program to calculate the recommended heating time based on the number of atoms to be heated.
 * 
 */
package CodingChallengePractice;
import java.util.Scanner;

public class microwave {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int item;
		double heattime;
		double total;
		
		System.out.println("enter item no and heating time");
		item=sc.nextInt();
		heattime=sc.nextDouble();
		
		
sc.close();
	}

}
