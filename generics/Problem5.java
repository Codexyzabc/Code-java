/*5. Write the following methods that return a lambda expression performing a specified action:
isOdd(): The lambda expression must return true if a number is odd or false if it is even.
isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not. */

interface Odd{
    public boolean isOdd(int x);
}

interface Prime{
    public boolean isPrime(int x);
}

interface Palindrome{
    public boolean isPalindrome(int x);
}

public class Problem5 {
    public static void main(String[] args) {
        Odd a=(x)->{
            if(x%2!=0){
                return true;

            }
            return false;

        };
        
        Prime p=(x)->{
            int count=0;
            for(int i=1;i<=x;i++){
                if(x%i==0){
                    count=count+1;
                }
            }
            if(count==2){
                return true;
            }
            return false;

        };

        Palindrome p1=(x)->{
            int original=x;
            int sum=0; int rem=0;
            while (x>0) {
                rem=x%10;
                sum=sum*10+rem;
                x=x/10;               
            }
            if(sum==original){
                return true;
            }
            return false;
        };

        if(a.isOdd(6)){
            System.out.println("It is odd");
        }
        else{ System.out.println("not odd ");}
        if(p.isPrime(8)){
            System.out.println("Prime");
        }
        else{System.out.println("not prime");}
        if(p1.isPalindrome(121)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
