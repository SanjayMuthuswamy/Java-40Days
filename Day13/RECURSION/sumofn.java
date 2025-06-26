package RECURSION;

import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        System.out.println(sumofNumbers(num));
    }

    public static int sumofNumbers(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumofNumbers(num -1);
        }
    }
}
