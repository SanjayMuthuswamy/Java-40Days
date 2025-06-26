package Day12;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replace(" ", "");

        char[] a = str.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char i : a) {
            set.add(i);
        }

        StringBuilder res =  new StringBuilder() ; 
        for (char i :  set ){
            res.append(i) ; 
            // System.out.print(i);
        }
        System.out.println(res.toString());
    }
}
