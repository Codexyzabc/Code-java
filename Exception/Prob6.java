/* Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are three
possible user input errors that can prevent the program from executing normally.
The first error is when the user provides no argument while executing the program and an
ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
The second error is NumberFormalException that is raised in case the user provides a
non-integer (float double) value at the command line.The third error is IllegalArgument
Exception. This needs to be thrown manually if the value at the command line is 0.*/


package Exception;
public class Prob6 {

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Please provide a value at the command line.");
            }

            int inputValue = Integer.parseInt(args[0]);

            if (inputValue == 0) {
                throw new IllegalArgumentException("Value must be greater than 0 for factorial calculation.");
            }

            long factorial = calculateFactorial(inputValue);
            System.out.println("Factorial of " + inputValue + " is: " + factorial);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer value at the command line.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static long calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
