import java.util.ArrayList;
import java.util.Scanner;

//Statement: Counting Rock Samples
//        Juan Marquinho is a geologist and he needs to count rock samples in order to send it
//        to a chemical laboratory. He has a problem: The laboratory only accepts rock samples
//        by a range of its size in ppm (parts per million).
//        Juan Marquinho receives the rock samples one by one and he classifies the rock
//        samples according to the range of the laboratory. This process is very hard because the
//        number of rock samples may be in millions.
//        Juan Marquinho needs your help, your task is to develop a program to get the number
//        of rocks in each of the ranges accepted by the laboratory.


public class Codev_9_CountingRockSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rock samples (S) and the number of ranges (R)
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        // Create an array to store the rock samples
        int[] samples = new int[s];

        // Input the rock samples as a space-separated list
        for (int i = 0; i < s; i++) {
            samples[i] = scanner.nextInt();
        }

        // Create an ArrayList to store the results
        ArrayList<Integer> res = new ArrayList<>();

        // Input the ranges and count the samples within each range
        while (t > 0) {
            t--;
            int count = 0;
            int low = scanner.nextInt();
            int up = scanner.nextInt();
            for (int i = 0; i < s; i++) {
                if (samples[i] >= low && samples[i] <= up) {
                    count++;
                }
            }
            res.add(count);
        }

        // Output the results
        for (int num : res) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
//        10 2
//        345 604 321 433 704 470 808 712 517 811
//        300 350
//        400 700