package Day11 ; 
import java.util.Scanner;

//boundary traversal

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i <  n ; i++){
            for(int j=0 ; j < n ; j++){
                if (j==0 || j==n-1 || i==0 || i == n-1 ) {
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}