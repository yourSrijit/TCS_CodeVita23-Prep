import java.util.Scanner;

//Statement: Monkey Grooving
//        N monkeys are invited to a party where they start dancing. They dance in a circular
//        formation, very similar to a Gujarati Garba or a Drum Circle. The dance requires the
//        monkeys to constantly change positions after every 1 second.
//        The change of position is not random & you, in the audience, observe a pattern.
//        Monkeys are very disciplined & follow a specific pattern while dancing.
//        Consider N = 6, and an array monkeys = {3,6,5,4,1,23.
//        This array (1-indexed) is the dancing pattern. The value at monkeys[i], indicates the
//        new of position of the monkey who is standing at the ith position.
//        Given N & the array monkeys[ ], find the time after which all monkeys are in the initial
//        positions for the 1st time.

public class Codev_14_MonkryGrooving {
    // Method to calculate the greatest common divisor (GCD) using Euclidean algorithm
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t, n, i, res, c, temp, temp1;

        // Read the number of test cases
        t = sc.nextLong();

        while (t > 0) {
            t--;

            // Read the value of n for each test case
            n = sc.nextLong();

            long[] a = new long[(int) n];

            // Read the array of integers a
            for (i = 0; i < n; i++) {
                a[(int) i] = sc.nextLong();
            }

            i = 0;
            res = 1;
            c = 0;

            while (i <= n - 1) {
                temp1 = i;
                c = 0;

                while (a[(int) i] != 0) {
                    temp = (int) i;
                    i = (int) a[(int) i] - 1;
                    a[(int) temp] = 0;
                    c += 1;
                }

                i = temp1 + 1;

                if (c != 0) {
                    res = res * c / gcd(res, c);
                }
            }

            System.out.println(res);
        }

        sc.close();
    }
}

