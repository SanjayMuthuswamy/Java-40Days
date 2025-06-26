package RECURSION;

import java.util.Scanner;

public class stringrev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        System.out.println(strrev(str));
    }

    public static String strrev(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return strrev(str.substring(1)) + str.charAt(0);
    }
}
