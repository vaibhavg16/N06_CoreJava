
/* There are n people standing in a circle waiting to be executed. 
 * The counting out begins at sometime in the circle and proceeds around the circle in fix direction.
 * In each state a certain number people are skipped and next person is executed.
 * Parenthesis Which is becoming smaller and smaller as executive people are removed.
 * Only the last person remains, with given freedom. 
 * Given:
 * Total no. of person:N
 * a no. came that indicates : k-1 person are skipped & the k person will be killed in circle.
 * the task is to choose the person in the initial 
 */
package Challenge;
import java.util.Scanner;
public class CircleSurvivedChallenge 
{
	static int survive(int n,int k)
	{
		if(n==1)
		
			return 1;
		
		else
		
			return(survive(n-1,k)+k-1)%n+1;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n and k");
		int n=sc.nextInt();
		int k=sc.nextInt();
		int s = survive(n,k);
		System.out.println(s);
		sc.close();
	}
}
