package RECURSION;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(fibo(num));  
    }

    public static int fibo(int num) {
        if (num == 0 || num == 1) {
            return num; 
        }
        return fibo(num - 1) + fibo(num - 2);  
    }
}
