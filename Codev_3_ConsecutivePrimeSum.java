import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//Statement: Some prime numbers can be expressed as Sum of other consecutive
//        prime numbers. For example
//        5 = 2 + 3
//        17 = 2 + 3 + 5 + 7
//        41 = 2 + 3 + 5 + 7 + 11 + 13
//        Your task is to find out how many prime numbers which satisfy this property are
//        present in the range 3 to N subject to a constraint that summation should always star
//        with number 2.
//        Write code to find out number of prime numbers that satisfy the above mentioned
//        property in a given range.


public class Codev_3_ConsecutivePrimeSum {
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static int noOfPrimeSum(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        for (int num1 : arr) {
            int sum = 0;
            for (int num2 : arr) {
                sum += num2;
                if (sum == num1) {
                    count++;
                    break;
                }
                if (sum > num1) {
                    break;
                }
            }
        }
        return count-1;   // Excluding 2
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int num = scanner.nextInt();
        int res = noOfPrimeSum(num);
        System.out.println("No of prime numbers that can be represented as the sum of prime numbers is " + res);
    }
}
