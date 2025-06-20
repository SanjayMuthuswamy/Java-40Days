package Day11;

//

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rowmax = 0 ;
        int colmax = 0 ; 

        for (int i = 0; i < n; i++) {
            int rowsum = 0;
            for (int j = 0; j < n; j++) {
                rowsum += arr[i][j];
            }
            // System.out.println("Row " + i + " Sum: " + rowsum);

            if (rowmax<rowsum){
                rowmax = rowsum ; 
            }
        }

        for (int j = 0; j < n; j++) {
            int colsum = 0;
            for (int i = 0; i < n; i++) {
                colsum += arr[i][j];
            }
            // System.out.println("Column " + j + " Sum: " + colsum);

            if (colmax<colsum){
                colmax =colsum ; 
            }

        }
        System.out.println("Column max :" +  colmax +"\n"+"Row max :"+rowmax);
    }
}
