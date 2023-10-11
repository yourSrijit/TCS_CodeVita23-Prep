import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Lexi String
//        Little Jill jumbled up the order of the letters in our dictionary. Now, Jack uses this list to find the smallest lexicographical string that can be made out of this new order.
//        Can you help him?
//        (In mathematics, the lexicographic or lexicographical order is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.)
//        You are given a string P that denotes the new order of letters in the English dictionary.
//        You need to print the smallest lexicographic string made from the given string S.
public class Codev_1_LexiString {
    public static String Lexi(String p,String s){
        String ans=new String("");
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(p.indexOf(s.charAt(i)));
        }
        Collections.sort(arr);
        for(int num:arr){
            ans+=p.charAt(num);
        }
       return ans;
    }
    public static void main(String[] args) {
    String p=new Scanner(System.in).nextLine();
    String s=new Scanner(System.in).nextLine();
    String result=Lexi(p,s);
    System.out.println(result);
    }
}
