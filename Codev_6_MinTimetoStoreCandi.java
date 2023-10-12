import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Statement: Krishna loves candies a lot, so whenever he gets them, he stores them so that
//        he can eat them later whenever he wants to.
//        He has recently received N boxes of candies each containing C, candies where C, represents the
//        total number of candies in the ith box. Krishna wants to store them in a single box. The only
//        constraint is that he can choose any two boxes and store their joint contents in an empty box
//        only. Assume that there are an infinite number of empty boxes available.
//        At a time he can pick up any two boxes for transferring and if both the boxes contain X and Y
//        number of candies respectively, then it takes him exactly X+Y seconds of time. As he is too eager
//        to collect all of them he has approached you to tell him the minimum time in which all the
//        candies can be collected.
public class Codev_6_MinTimetoStoreCandi {
    public static int findMinTimeToStore(int arr[],int n){
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i:arr){
            arr1.add(i);
        }
        int sum=0;
        while(arr1.size()>=2){
            Collections.sort(arr1);
            sum=arr1.get(0)+arr1.get(1);
            arr2.add(sum);
            arr1.remove(0);
            arr1.remove(0);
            arr1.add(sum);
        }
        sum=0;
        for(int val:arr2){
            sum+=val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int arr[]={1,2,3,4,5};
        System.out.println(findMinTimeToStore(arr,n));
    }
}
