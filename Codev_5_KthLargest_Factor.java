import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Statement: Kth Largest Factor Problem
//        A positive integer d is said to be a factor of another positive integer N
//        if when N is divided by d, the remainder obtained is zero. For
//        example, for number 12, there are 6 factors 1, 2, 3, 4, 6, 12. Every
//        positive integer k has at least two factors, 1 and the number k itself.
//        Given two positive integers N and k, write a program to print the kth
//        largest factor of N.
public class Codv_5_KthLargest_Factor {
    public static void findPrime(ArrayList<Long> arr,long num){
        for(long i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                arr.add(i);
                arr.add(num/i);
            }
        }
    }
    public static void main(String[] args) {
        long num=new Scanner(System.in).nextLong();
        int k=new Scanner(System.in).nextInt();
        ArrayList<Long> arr=new ArrayList<>();
        findPrime(arr,num);
        Collections.sort(arr);
        if(arr.size()==-1 || k>arr.size()) {
            System.out.println(1);
        }
        else{
        System.out.print(arr.get(arr.size()-k));
        }

    }
}
