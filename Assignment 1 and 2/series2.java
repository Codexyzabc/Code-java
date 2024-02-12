/*10. Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the
following series x – x
3
/3! + x5
/5! - x
7
/7! ...........................................*/



package assignment1;

import java.util.Scanner;

public class series2 
{
	public static int facto(int rem)
	{
		int ans=1;
		for(int i=1;i<=rem;i++)
		{
			ans*=i;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		System.out.println("Enter the value of x:");
		int x=sc.nextInt();
		int upper=1;
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double upperVal=Math.pow(x, upper);
			if(i%2==0)
			{
				upperVal=(upperVal/facto(upper))*-1;
			}
			else 
			upperVal=upperVal/facto(upper);
			sum+=upperVal;
			upper+=2;
		}
		System.out.println("The answer is: "+ sum);
	}
}



/*OUTPUT
 * Enter the number of terms:
5
Enter the value of x:
2
The answer is: 0.909347442680776
*/
 */

