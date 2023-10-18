import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Maneuvering a cave Problem (Asked in TCS Codevita 2020, October)
//        The task is to count all the possible paths from top left to bottom right of a m x n matrix with the constraints
//        that from each cell you can either move only to right or down.
//        Input:
//        First line consists of T test cases. First line of every test case consists of N and M, denoting the number of
//        rows and number of columns respectively.
//        Output:
//        Single line output i.e count of all the possible paths from top left to bottom right of a m x n matrix..



import java.util.Scanner;

import java.util.Scanner;

public class NoOfWaytoReach {

    // Define a method to calculate the number of ways to reach the cell at row `i` and column `j`.
    public static long noOfWay(int i, int j) {
        // Create a table to store the number of ways to reach each cell.
        long[][] dp = new long[i][j];

        // Initialize the first row and first column.
        for (int k = 0; k < i; k++) {
            dp[k][0] = 1;
        }
        for (int k = 0; k < j; k++) {
            dp[0][k] = 1;
        }

        // Fill up the table in a bottom-up manner.
        for (int k = 1; k < i; k++) {
            for (int l = 1; l < j; l++) {
                dp[k][l] = dp[k - 1][l] + dp[k][l - 1];
            }
        }

        // Return the number of ways to reach the bottom-right corner of the cave.
        return dp[i - 1][j - 1];
    }

    // Define the main method.
    public static void main(String[] args) {
        // Create a scanner to read the input.
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases.
        int t = sc.nextInt();

        // Iterate over the test cases.
        for (int i = 0; i < t; i++) {
            // Read the number of rows and columns in the cave.
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Calculate the number of ways to reach the bottom-right corner of the cave.
            long ways = noOfWay(n, m);

            // Print the number of ways to reach the bottom-right corner of the cave.
            System.out.println(ways);
        }

        // Close the scanner.
        sc.close();
    }
}



