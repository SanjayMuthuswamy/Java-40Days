package Day11;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i=0 ; i < n  ; i++){
             for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]){
                    System.out.println("Not a Sys");
                    return  ; 
                }
            }
        }           
        System.out.println("It`s a Sys");   
    }
}
