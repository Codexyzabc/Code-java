/*8. Write a Program in Python to find the sum of all the Prime numbers between a given range of
numbers.*/



package assignment1;
import java.util.*;
public class PrimeRange
{
    public static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        else
        {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting limit...:");
        int i=sc.nextInt();
        System.out.println("Enter the ending limit:");
        int j=sc.nextInt();
        int sum=0;
        for(int x=i;x<=j;x++){
            if(isPrime(x)){
                sum+=x;
            }
        }
        System.out.println("the sum of all prime numbers between "+i+" to "+j+" is: "+(sum));
    }
}



/*OUTPUT

Enter the starting limit...:
1
Enter the ending limit:
20
the sum of all prime numbers between 1 to 20 is: 77*/