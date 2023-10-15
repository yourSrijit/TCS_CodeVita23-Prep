//Statement: Similar character problem
//        Tahir and Mamta are working on a project in TCS. Tahir being a problem solver came up
//        with an interesting problem for his friend Mamta.
//        The problem consists of a string of length N and contains only small case alphabets.
//        It will be followed by Q queries, in which each query will contain an integer P (1<=P<=N)
//        denoting a position within the string.
//        Mamta's task is to find the alphabet present at that location and determine the number
//        of occurrences of the same alphabet preceding the given location P.
//        Mamta is busy with her office work. Therefore, she asked you to help her.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//        Input Format:
//                   First-line contains an integer N, denoting the length of the string.
//        Second-line contains string S itself consists of small case alphabets only ('a' - 'z').
//        The third line contains an integer Q denoting the number of queries that will be asked.
//        Next, Q lines contain an integer P (1 <= P <= N) for which you need to find the number
//        occurrence of character present at the Pth location preceding P.
public class Codev_12_SimilarCharProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
       int T=sc.nextInt();
        while(T>0){
            int count=0;
            int p=sc.nextInt();
            char c=s.charAt(p-1);
            for (int i = 0; i < p - 1; i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }

    }
}
