/*5. The straight-line method of computing the early depreciation of the value of an item is
given by:

Depreciation = Purchase price - Salvage value

Years of service

Write a program to determine the salvage value of an item when the purchase price years
of service & the annual preciation is given.*/




package assignment2;

import java.util.Scanner;

public class SalvageValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase price: ");
        double purchasePrice = scanner.nextDouble();

        System.out.print("Enter the number of years of service: ");
        int yearsOfService = scanner.nextInt();

        System.out.print("Enter the annual depreciation: ");
        double annualDepreciation = scanner.nextDouble();

        double salvageValue = calculateSalvageValue(purchasePrice, yearsOfService, annualDepreciation);

        System.out.println("The salvage value of the item is: " + salvageValue);

        scanner.close();
    }

    public static double calculateSalvageValue(double purchasePrice, int yearsOfService, double annualDepreciation) {
        return purchasePrice - (annualDepreciation * yearsOfService);
    }
}

/*OUTPUT

Enter the purchase price: 2000
Enter the number of years of service: 3
Enter the annual depreciation: 300
The salvage value of the item is: 1100.0
*/