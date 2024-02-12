/*9. Write a program to find the elements, a [i, j] in a two-dimensional array which are
maximum element to the ith row and jth column.*/



package assignment2;

import java.util.Scanner;

public class MaxElementsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows...");
        int numRows = in.nextInt();

        System.out.println("Enter the number of columns...");
        int numCols = in.nextInt();

        int[][] matrix = new int[numRows][numCols];

        // Input elements into the matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println("Enter the (" + i + "," + j + ")th term");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("\nThe 2D matrix is:- ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nMaximum elements in each row:");
        for (int i = 0; i < numRows; i++) {
            int maxRowValue = matrix[i][0];

            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] > maxRowValue) {
                    maxRowValue = matrix[i][j];
                }
            }

            System.out.println("Maximum element of row " + i + " is " + maxRowValue);
        }

        System.out.println("\nMaximum elements in each column:");
        for (int j = 0; j < numCols; j++) {
            int maxColValue = matrix[0][j];

            for (int i = 0; i < numRows; i++) {
                if (matrix[i][j] > maxColValue) {
                    maxColValue = matrix[i][j];
                }
            }

            System.out.println("Maximum element of column " + j + " is " + maxColValue);
        }

        in.close();
    }
}



/*OUTPUT

Enter the number of rows...
3
Enter the number of columns...
3
Enter the (0,0)th term
2
Enter the (0,1)th term
5
Enter the (0,2)th term
9
Enter the (1,0)th term
6
Enter the (1,1)th term
8
Enter the (1,2)th term
9
Enter the (2,0)th term
7
Enter the (2,1)th term
5
Enter the (2,2)th term
65

The 2D matrix is:- 
2  5  9  
6  8  9  
7  5  65  

Maximum elements in each row:
Maximum element of row 0 is 9
Maximum element of row 1 is 9
Maximum element of row 2 is 65

Maximum elements in each column:
Maximum element of column 0 is 7
Maximum element of column 1 is 8
Maximum element of column 2 is 65
*/