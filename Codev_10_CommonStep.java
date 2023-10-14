import java.awt.*;
import java.util.Scanner;

public class Codev_10_CommonStep {
    public static int CountWays(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        dp[2]=2;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=CountWays(n);
        System.out.print(result);
    }
}
