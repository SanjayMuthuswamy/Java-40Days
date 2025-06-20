package Day11;

//Transpose of matrix

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
