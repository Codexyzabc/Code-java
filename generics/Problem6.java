/*Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
calculator perform Addition, Subtraction, Division, Multiplication operation. */

import java.util.Scanner;

interface Sum{
	double sum(double a,double b);
}
public class Problem6 {
	public static Sum sum() {
		Sum s1=(p,q)->{
			return p+q;
		};
		return s1;
		
	}
	public static Sum sub() {
		Sum s1=(p,q)->{
			return p-q;
		};
		return s1;
		
	}
	public static Sum mult() {
		Sum s1=(p,q)->{
			return p*q;
		};
		return s1;
		
	}
	public static Sum div() {
		Sum s1=(p,q)->{
			try{
				
				return p/q;
			}catch(Exception e) {
				System.out.println("division by 0 not possible");
				return -1;
			}
		};
		return s1;
		
	}
	public static void main(String []args) {
		double x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2 numbers:");
		x=sc.nextDouble();
		y=sc.nextDouble();
		System.out.println("Options: 1.sum, 2.sub, 3.multiplication, 4.division.");
		System.out.println("Enter the option:");
		
		int control=sc.nextInt();
		if(control==1) {
			System.out.println("sum is:"+sum().sum(x, y));
		}
		else if(control==2) {
			System.out.println("subtraction is:"+sub().sum(x, y));

		}
		else if(control==3) {
			System.out.println("multiplication is:"+mult().sum(x, y));

		}
		else if(control==4) {
			System.out.println("division is:"+div().sum(x, y));

		}
		else {
			System.out.println("something went wrong");
		}
	}
}

/*enter 2 numbers:
2
5.
Options: 1.sum, 2.sub, 3.multiplication, 4.division.
Enter the option:
3
multiplication is:10.0 */

interface Operation {
    double operate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Cannot divide by zero");
            }
        };

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        
        try {
            System.out.println("Division: " + division.operate(5, 3));
            // Uncomment the line below to test division by zero exception
            // System.out.println("Division: " + division.operate(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
