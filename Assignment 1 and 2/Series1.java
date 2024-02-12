/*9. Write a program to obtain the sum of the n terms (n to be taken from the user) of the
following series 1 - 3
2
/2 + 53
/3 - 7
4
/4.................................................*/




package assignment1;
import java.util.*;

public class Series1
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of terms...");
		int n=in.nextInt();
		int upper=1;
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double upperVal=Math.pow(upper, i);
			if(i%2==0)
			{
				upperVal=(upperVal/i)*-1;
			}
			else 
			upperVal=upperVal/i;
			sum+=upperVal;
			upper+=2;
		}
		System.out.println("The answer is: "+ sum);
	}
}

/*OUTPUT
 * 
 * Enter the number of terms...
5
The answer is: 11247.716666666665
*/
