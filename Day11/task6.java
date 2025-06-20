package Day11;

import java.util.Scanner;

// 90 degree rot
public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            } 
        }     

        for (int i=0 ;  i < n ; i++){
            for (int j=0 ; j  < n ;  j++){
                if (i==0 || i==n-1){
                    System.out.print(arr[n-1-i][j] + " ") ; 
                }
                else{
                    System.out.print(arr[i][j] + " ") ; 
                }
            }
            System.out.println(" ");
        }
    }
}
