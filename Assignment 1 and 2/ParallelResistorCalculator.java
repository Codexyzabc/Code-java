/*4. The formula for resistors connected in parallel is a little more complex. Given two
resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a
program that calculates the resistance of a group of resistors arranged in parallel.*/




package assignment2;

import java.util.Scanner;

public class ParallelResistorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of resistors: ");
        int n = scanner.nextInt();

        double[] resistances = new double[n];

        // Input the resistance values for each resistor
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the resistance of resistor " + (i + 1) + " (in ohms): ");
            resistances[i] = scanner.nextDouble();
        }

        double equivalentResistance = calculateEquivalentResistance(resistances);

        System.out.println("Equivalent Resistance for the " + n + " resistors in parallel: " + equivalentResistance + " ohms");

        scanner.close();
    }

    public static double calculateEquivalentResistance(double[] resistances) {
        double sumOfInverseResistances = 0.0;

        for (double resistance : resistances) {
            sumOfInverseResistances += 1.0 / resistance;
        }

        return 1.0 / sumOfInverseResistances;
    }
    
}


/*OUTPUT

Enter the number of resistors: 3
Enter the resistance of resistor 1 (in ohms): 5
Enter the resistance of resistor 2 (in ohms): 12
Enter the resistance of resistor 3 (in ohms): 9
Equivalent Resistance for the 3 resistors in parallel: 2.535211267605634 ohms
*/