package OOPS.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        String str = scan.next(); // Correct way to read 'R' or 'L' after number

        if (str.equals("R")) {
            System.out.println("(" + num + ",0)");
        } else {
            System.out.println("(" + (num * -1) + ",0)");
        }
    }
}
