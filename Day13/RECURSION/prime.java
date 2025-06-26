package RECURSION;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        printPrimes(2, num);

    }
    public static void printPrimes(int current, int n) {
        if (current > n) return;

        if (isPrime(current, 2)) {
            System.out.println(current);
        }

        printPrimes(current + 1, n);
    }

    public static boolean isPrime(int num, int i) {
        if (num <= 1) return false;
        if (i * i > num) return true;
        if (num % i == 0) return false;
        return isPrime(num, i + 1);
    }
}  

