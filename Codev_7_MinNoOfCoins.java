import java.util.Scanner;

//Statement:
//        Find the minimum number of coins required to form any value between 1 to N, both inclusive.
//        Cumulative value of coins should not exceed N. Coin denominations are 1 Rupee, 2 Rupee and 5
//        Rupee. Let's understand the problem using the following example. Consider the value of N is 13,
//        then the minimum number of coins required to formulate any value between 1 and 13, is 6. One
//        5 Rupee, three 2 Rupee and two 1 Rupee coins are required to realize any value between 1 and
//        13. Hence this is the ans. However, if one takes two 5 Rupee coins, one 2 rupee coins and two 1
//        rupee coins, then to all values between 1 and 13 are achieved. But since the cumulative value of
//        all coins equals 14, i.e., exceeds 13, this is not the answer.
public class Codev_7_MinNoOfCoins {
    public static void main(String[] args) {
        int number=new Scanner(System.in).nextInt();
        int five=(number-4)/5;
        int one;
        if((number-five*5)%2==0){
            one=2;
        }
        else {
            one=1;
        }
        int two=(number -five*5-one*1)/2;
        int total=five+two+one;
        System.out.print(total+" "+five+" "+two+" "+one);
    }
}
