import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Statement:
//        Given two numbers n1 and n2. Find prime numbers between n1 and n2, then make all possible
//        unique combinations of numbers from the prime numbers list you found in step 1.
//        From this new list, again find all prime numbers. Find smallest (a) and largest (b) number from
//        the 2nd generated list, also count of this list.
//        Consider smallest and largest number as the 1st and 2nd number to generate Fibonacci series
//        respectively till the count (number of primes in the 2nd list).
//        Print the last number of a Fibonacci series as an output
public class Codev_4_PrimeFibonacci {
    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {  /// Main method
        int n=new Scanner(System.in).nextInt();
        int m=new Scanner(System.in).nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=n;i<=m;i++){
            if(isPrime(i)){
                arr1.add(i);
            }
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i:arr1){
            for(int j:arr1){
                String str=Integer.toString(i)+j;
                int ans=Integer.parseInt(str);
                if(isPrime(ans) && arr2.contains(ans)==false){
                    arr2.add(ans);
                }
            }
        }
        long num1= Collections.min(arr2);
        long num2= Collections.max(arr2);
        System.out.println(num1+" "+num2);
        long sum=0;
        for(int i=0;i<arr2.size()-2;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        System.out.println(sum);

        // Main method
    }
}
