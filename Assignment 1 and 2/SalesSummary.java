/*10. A company has four salespeople (1 to 4) who sell five different products (1 to 5). Once a
day, each salesperson passes in a slip for each different type of product sold. Each slip
contains:
* The salesperson number
* The product number
* The total dollar value of that product sold that day

Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the
information from all of the slips for last month is available. Write a program that will
read all this information for last month’s sales and summarize the total sales by
salesperson by product. All totals should be stored in the double-subscripted array sales.
After processing all the information for last month, print the results in tabular format with
each of the columns represent a particular salesperson and each of the rows representing a
particular product. Cross total each row to get the total sales of each product for last
month, and cross total each column to get the total sales by salesperson for last month.
Your tabular printout should include these cross totals to the right of the totaled rows and
to the bottom of the totaled columns.*/





package assignment2;

import java.util.Scanner;

public class SalesSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSalespeople = 4;
        int numProducts = 5;

        double[][] sales = new double[numProducts][numSalespeople];

        System.out.println("Enter sales information for last month:");

        while (true) {
            System.out.print("Enter the salesperson number (1-4), product number (1-5), and total sales value: ");
            int salesperson = scanner.nextInt();
            int product = scanner.nextInt();
            double salesValue = scanner.nextDouble();

            if (salesperson >= 1 && salesperson <= numSalespeople && product >= 1 && product <= numProducts) {
                sales[product - 1][salesperson - 1] += salesValue;
            } else {
                System.out.println("Invalid input. Salesperson and product numbers should be in the specified range.");
            }

            System.out.print("Do you want to enter more sales information? (1 for yes, 0 for no): ");
            int moreInfo = scanner.nextInt();

            if (moreInfo == 0) {
                break;
            }
        }

        // Calculate the row and column totals
        double[] productTotals = new double[numProducts];
        double[] salespersonTotals = new double[numSalespeople];

        for (int i = 0; i < numProducts; i++) {
            for (int j = 0; j < numSalespeople; j++) {
                productTotals[i] += sales[i][j];
                salespersonTotals[j] += sales[i][j];
            }
        }

        // Print the results in tabular format
        System.out.println("Sales Summary:");
        System.out.print("Product/Salesperson\t");
        for (int j = 0; j < numSalespeople; j++) {
            System.out.print("Salesperson " + (j + 1) + "\t");
        }
        System.out.println("Product Total");

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Product " + (i + 1) + "\t\t\t");
            for (int j = 0; j < numSalespeople; j++) {
                System.out.print(sales[i][j] + "\t\t");
            }
            System.out.println(productTotals[i]);
        }

        System.out.print("Salesperson Total\t");
        for (int j = 0; j < numSalespeople; j++) {
            System.out.print(salespersonTotals[j] + "\t\t");
        }
        System.out.println();

        scanner.close();
    }
}



/*OUTPUT
Enter sales information for last month:
Enter the salesperson number (1-4), product number (1-5), and total sales value: 2
3
200
Do you want to enter more sales information? (1 for yes, 0 for no): 1
Enter the salesperson number (1-4), product number (1-5), and total sales value: 4
4
300
Do you want to enter more sales information? (1 for yes, 0 for no): 1
Enter the salesperson number (1-4), product number (1-5), and total sales value: 2
3
300
Do you want to enter more sales information? (1 for yes, 0 for no): 1
Enter the salesperson number (1-4), product number (1-5), and total sales value: 2
2
200
Do you want to enter more sales information? (1 for yes, 0 for no): 0
Sales Summary:
Product/Salesperson	Salesperson 1	Salesperson 2	Salesperson 3	Salesperson 4	Product Total
Product 1			0.0		0.0		0.0		0.0		0.0
Product 2			0.0		200.0		0.0		0.0		200.0
Product 3			0.0		500.0		0.0		0.0		500.0
Product 4			0.0		0.0		0.0		300.0		300.0
Product 5			0.0		0.0		0.0		0.0		0.0
Salesperson Total	0.0		700.0		0.0		300.0		
*/