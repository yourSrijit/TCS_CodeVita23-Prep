import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Given an array of integers, perform atmost K operations so that the sum of elements of final array is minimum
//        An operation is defined as follows -
//        - Consider any 1 element from the array, arri].
//        - Replace arr[i] by floor(arr(il/2).
//        - Perform next operations on the updated array.
//        - The task is to minimize the sum after utmost K operations.
//        Constraints
//        1 <= N
//        К <= 10^5.
//        Input
//        - First line contains two integers N and K representing size of array and maximum numbers of operations that
//        can be performed on the array respectively.
//        - Second line contains N space separated integers denoting the elements of the array, arr.
//        Output
//        - Print a single integer denoting the minimum sum of the final array.
//        Full screen
        public class Minimize_Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        while(k>0 && pq.size()>0){
            int num=pq.poll();
            pq.add(num/2);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        System.out.println("Minimum numner is "+sum);
    }
}
