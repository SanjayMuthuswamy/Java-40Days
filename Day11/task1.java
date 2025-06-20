package Day11;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int esum = 0;
        int osum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    esum += arr[i][j];
                } else {
                    if (i % 2 != 0 && j % 2 != 0) {
                        osum += arr[i][j];
                    }
                }
            }
        }

        System.out.println("Even Sum: " + esum);
        System.out.println("Odd Sum: " + osum);
        System.out.println("Diff (abs): " + Math.abs(esum - osum));
        System.out.println("Diff (max): " + Math.max(esum, osum));
    }
}
