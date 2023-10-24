//Given schedule of trains and their stoppage time at a Railway Station, find minimum number of platforms
//        needed.
//        Note - If Train A's departure time is x and Train B's arrival time is x, then we can't accommodate Train B on the
//        same platform as Train A.
//        Constraints
//        1 <= N <= 10^5
//        0 <= a <= 86400
//        0 < b <= 86400
//        Number of platforms > 0
//        ^ Pull up for precise see
//        Input:
//        First line contains N denoting number of trains.
//        Next N line contain 2 integers, a and b, denoting the arrival time and stoppage time of train.
//        Output
//        Single integer denoting the minimum numbers of platforms needed to accommodate every train.

import javax.crypto.spec.DESedeKeySpec;
import java.beans.DefaultPersistenceDelegate;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RailwayStation_Prob {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arrival[]=new int[n];
        int departure[]=new int[n];
        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
            int stopage=sc.nextInt();
            departure[i]=arrival[i]+stopage;
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i=1,j=0;
        int minPlat=1,plat=1;
        while(i<n && j<n) {
            if (arrival[i] <= departure[j]) {
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            minPlat = Math.max(plat, minPlat);
        }
        System.out.println(minPlat);
    }
}
