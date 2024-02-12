/*3. Write a program to evaluate, the following investment equation: V=P ( 1 + r )n
and print the tables which would give the values of V for various combinations of the
following values of P, r & n.
P : 1000,2000,3000,...........,10,000 R : 0.10,0.11,0.12,................0.20
n : 1,2,3,..............................,10*/





package assignment2;

public class InvestmentTable {
    public static void main(String[] args) {
        // Define the range of values for P, r, and n
        int pStart = 1000;
        int pEnd = 10000;
        double rStart = 0.10;
        double rEnd = 0.20;
        int nMax = 10;

        // Print the table header
        System.out.println("P\t\tR\t\tN\t\tV");

        // Iterate through the combinations of P, r, and n
        for (int p = pStart; p <= pEnd; p += 1000) {
            for (double r = rStart; r <= rEnd; r += 0.01) {
                for (int n = 1; n <= nMax; n++) {
                    double v = calculateInvestmentValue(p, r, n);
                    System.out.printf("%d\t\t%.2f\t\t%d\t\t%.2f%n", p, r, n, v);
                }
            }
        }
    }

    public static double calculateInvestmentValue(int p, double r, int n) {
        return p * Math.pow(1 + r, n);
    }
}

/*OUTPUT
P		R		N		V
1000		0.10		1		1100.00
1000		0.10		2		1210.00
1000		0.10		3		1331.00
1000		0.10		4		1464.10
1000		0.10		5		1610.51
1000		0.10		6		1771.56
1000		0.10		7		1948.72
1000		0.10		8		2143.59
1000		0.10		9		2357.95
1000		0.10		10		2593.74
1000		0.11		1		1110.00
1000		0.11		2		1232.10
1000		0.11		3		1367.63
1000		0.11		4		1518.07
1000		0.11		5		1685.06
1000		0.11		6		1870.41
1000		0.11		7		2076.16
1000		0.11		8		2304.54
1000		0.11		9		2558.04
1000		0.11		10		2839.42
1000		0.12		1		1120.00
1000		0.12		2		1254.40
1000		0.12		3		1404.93
1000		0.12		4		1573.52
1000		0.12		5		1762.34
1000		0.12		6		1973.82
1000		0.12		7		2210.68
1000		0.12		8		2475.96
1000		0.12		9		2773.08
1000		0.12		10		3105.85*/
