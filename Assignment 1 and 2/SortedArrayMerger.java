/*7. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
a program to merge them into single sorted array C that contains every item from arrays.
A & B, in ascending order.*/





package assignment2;

public class SortedArrayMerger {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};

        int[] C = mergeSortedArrays(A, B);

        System.out.println("Merged Array C:");
        for (int value : C) {
            System.out.print(value + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < n) {
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }
}

/*OUTPUT
Merged Array C:
1 2 3 4 5 6 7 8 9 10 */